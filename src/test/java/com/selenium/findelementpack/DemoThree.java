package com.selenium.findelementpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class DemoThree {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
        for (WebElement link : links) {
            link.click();
            System.out.println(driver.getCurrentUrl());
            driver.navigate().back();
        }
        driver.quit();
    }
}

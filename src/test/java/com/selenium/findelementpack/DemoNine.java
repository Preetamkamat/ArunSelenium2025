package com.selenium.findelementpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class DemoNine {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        List<WebElement> dropdown = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
        for (WebElement list : dropdown) {
            System.out.println(list.getText());
        }
        driver.quit();
    }
}

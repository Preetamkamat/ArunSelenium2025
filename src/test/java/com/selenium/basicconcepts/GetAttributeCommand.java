package com.selenium.basicconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class GetAttributeCommand {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        String buttonOneText = driver.findElement(By.id("button9")).getText();
        System.out.println(buttonOneText);
        String s = driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[2]/input")).getAttribute("value");
        Assert.assertEquals(s, "Search");
        boolean status = driver.findElement(By.id("hbutton")).isDisplayed();
        System.out.println(status);
        driver.quit();
    }
}

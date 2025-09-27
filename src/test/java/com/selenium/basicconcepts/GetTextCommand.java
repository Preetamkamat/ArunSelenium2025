package com.selenium.basicconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class GetTextCommand {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        String actualText = driver.findElement(By.id("pah")).getText();
        Assert.assertEquals(actualText,"PracticeAutomationHere", "Text is not matching");
        driver.quit();
    }
}

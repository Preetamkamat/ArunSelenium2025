package com.selenium.basicconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;

import java.time.Duration;

public class Demo {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        // WebDriver driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "omayo (QAFox.com)", "Title is not matching");
        driver.quit();
    }
}

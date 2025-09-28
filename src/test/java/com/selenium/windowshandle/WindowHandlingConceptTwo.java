package com.selenium.windowshandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class WindowHandlingConceptTwo {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.id("ta1")).sendKeys("Preetam Kamat");
        driver.findElement(By.id("selenium143")).click();
        Set<String> windows = driver.getWindowHandles();
        String childWindow = null;
        for (String window : windows) {
            if (!window.equals(parentWindow)) {
                childWindow = window;
                break;
            }
        }
        driver.switchTo().window(childWindow);
        driver.findElement(By.linkText("What is Selenium?")).click();
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.switchTo().window(parentWindow);
        driver.findElement(By.name("q")).sendKeys("Preetam Kamat");
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}

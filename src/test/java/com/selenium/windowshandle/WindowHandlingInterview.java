package com.selenium.windowshandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class WindowHandlingInterview {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//p[normalize-space()='Open a popup window']")).click();

        Set<String> windows = driver.getWindowHandles();

        String childWindow = null;
        for (String window : windows) {
            if (!window.equals(parentWindow)) {
                childWindow = window;
                driver.switchTo().window(childWindow);
                driver.close();
                break;
            } else if (!parentWindow.equals(window)) {
                driver.switchTo().window(childWindow);
                driver.close();

            }
        }
    }
}

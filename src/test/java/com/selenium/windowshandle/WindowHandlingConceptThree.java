package com.selenium.windowshandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class WindowHandlingConceptThree {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        String parentWindow = driver.getWindowHandle();

        driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");

        driver.findElement(By.id("selenium143")).click();

        driver.findElement(By.linkText("Open a popup window")).click();

        Thread.sleep(3000);

        Set<String> windows = driver.getWindowHandles();

        String childWindowOne = null;
        String childWindowTwo = null;

        for (String window : windows) {
            driver.switchTo().window(window);
            if (driver.getTitle().equals("Selenium143")) {
                childWindowOne = window;
            } else if (driver.getTitle().equals("New Window")) {
                childWindowTwo = window;
            }
        }

        driver.switchTo().window(childWindowOne);
        driver.findElement(By.linkText("What is Selenium?")).click();
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(childWindowTwo);

        String pageHeading = driver.findElement(By.cssSelector("h3")).getText();
        System.out.println(pageHeading);

        driver.close();

        driver.switchTo().window(childWindowOne);

        driver.findElement(By.linkText("Index Page")).click();
        System.out.println(driver.getCurrentUrl());
        driver.close();

        driver.switchTo().window(parentWindow);

        driver.findElement(By.name("q")).sendKeys("Arun Motoori");

    }
}

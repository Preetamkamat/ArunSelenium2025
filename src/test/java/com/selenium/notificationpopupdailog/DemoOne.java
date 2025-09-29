package com.selenium.notificationpopupdailog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoOne {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin:admin @the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Basic Auth")).click();
    }
}

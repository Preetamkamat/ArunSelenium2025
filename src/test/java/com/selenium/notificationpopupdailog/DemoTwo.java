package com.selenium.notificationpopupdailog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class DemoTwo {
    public static void main(String[] args) {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--disable-notifications");
//
//        ChromeDriver driver = new ChromeDriver(chromeOptions);
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--disable-notifications");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.justdial.com/");

        driver.findElement(By.xpath("//div[text()='We are Hiring']")).click();
    }
}

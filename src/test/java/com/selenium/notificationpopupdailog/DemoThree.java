package com.selenium.notificationpopupdailog;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoThree {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/bootstrap/bootstrap_modal.asp");

        driver.findElement(By.xpath("//button[text()='Click To Open Modal']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));

        String headingText = driver.findElement(By.id("myModalLabel")).getText();
        System.out.println(headingText);

        String bodyText = driver.findElement(By.xpath("//div[@class='modal-content']//p")).getText();
        System.out.println(bodyText);

        driver.findElement(By.xpath("//button[text()='Close']")).click();
    }
}

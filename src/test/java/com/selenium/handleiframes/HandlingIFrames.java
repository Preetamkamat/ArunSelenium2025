package com.selenium.handleiframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingIFrames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://letcode.in/frame");
        driver.switchTo().frame("firstFr");
        driver.findElement(By.name("fname")).sendKeys("Arun");
        driver.findElement(By.name("lname")).sendKeys("Motoori");
//        driver.findElement(By.name("email")).sendKeys("arun.motoori@gmail.com");
        driver.switchTo().defaultContent();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement watchTutorialText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='card-footer-item button is-primary']")));
        watchTutorialText.click();
        Thread.sleep(3000);
        driver.quit();
    }
}

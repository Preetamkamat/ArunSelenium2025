package com.selenium.notificationpopupdailog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoFour {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://useinsider.com/web-push-notification/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement acceptAllButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wt-cli-accept-all-btn")));

        acceptAllButton.click();
    }
}

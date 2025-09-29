package com.selenium.handlemouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DemoOne {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        Actions action = new Actions(driver);
        WebElement blogsText = driver.findElement(By.id("blogsmenu"));
        blogsText.click();
        WebElement sbaOptions = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
        action.click(sbaOptions).build().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}

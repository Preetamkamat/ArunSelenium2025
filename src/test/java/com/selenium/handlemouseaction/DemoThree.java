package com.selenium.handlemouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DemoThree {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://omayo.blogspot.com/");

        Actions actions = new Actions(driver);
        WebElement textAreaField = driver.findElement(By.id("ta1"));
        actions.contextClick(textAreaField).perform();
    }
}

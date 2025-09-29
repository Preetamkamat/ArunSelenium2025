package com.selenium.handledropdownandlistdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DemoOne {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement dropdown = driver.findElement(By.id("drop1"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("doc 3");
        select.selectByIndex(2);
        select.selectByValue("mno");
    }
}

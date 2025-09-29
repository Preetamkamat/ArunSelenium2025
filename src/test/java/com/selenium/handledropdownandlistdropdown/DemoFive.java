package com.selenium.handledropdownandlistdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoFive {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        WebElement dropdownField = driver.findElement(By.id("justAnInputBox1"));
        dropdownField.click();
        driver.findElement(By.xpath("//h3[text()='Multi Selection With Cascade Option Select']/following-sibling::div//span[text()='choice 2 2']")).click();
        driver.quit();
    }
}

package com.selenium.handledropdownandlistdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemoFour {
    public static void main(String[] args) {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("iidisable-notifications");
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.hdfcbank.com/");

        driver.findElement(By.xpath("//div[@class='dropdown']/a[text()='Select Product Type']")).click();
        driver.findElement(By.xpath("//li[text()='Accounts']")).click();
        driver.findElement(By.xpath("//div[@class='dropdown']/a[text()='Select Product']")).click();
        driver.findElement(By.xpath("//li[text()='Current Accounts']")).click();

        driver.findElement(By.linkText("APPLY ONLINE")).click();

        driver.quit();

    }
}

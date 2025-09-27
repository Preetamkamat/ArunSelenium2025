package com.selenium.basicconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoThree {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        //driver.findElement(By.className("dropbtn")).click();
        //driver.findElement(By.id("ta1")).sendKeys("Preetam Kamat");
        //driver.findElement(By.name("q")).sendKeys("Selenium Java");
        //driver.findElement(By.cssSelector("input[value='Login']")).
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.quit();

    }
}

package com.selenium.basicconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoOne {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo");
        driver.findElement(By.name("search")).sendKeys("HP");
        driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
        driver.quit();
    }
}

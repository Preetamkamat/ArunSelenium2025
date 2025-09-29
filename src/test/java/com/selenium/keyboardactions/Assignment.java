package com.selenium.keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.makemytrip.com/");
        Actions action = new Actions(driver);

        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        action.sendKeys("hyd").pause(Duration.ofSeconds(1))
                .keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).
                keyUp(Keys.ARROW_DOWN).build().perform();
    }
}

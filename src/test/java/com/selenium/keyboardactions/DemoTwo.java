package com.selenium.keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DemoTwo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        Actions actions = new Actions(driver);
        WebElement jqueryUIElement = driver.findElement(By.linkText("jqueryui"));
        actions.keyDown(Keys.CONTROL).click(jqueryUIElement).keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}

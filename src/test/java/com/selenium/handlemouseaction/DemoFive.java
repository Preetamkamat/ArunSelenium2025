package com.selenium.handlemouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DemoFive {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/droppable/");
        Actions actions = new Actions(driver);
        driver.switchTo().frame(0);
        WebElement srcElement = driver.findElement(By.id("draggable"));
        WebElement destElement = driver.findElement(By.id("droppable"));
        //actions.clickAndHold(srcElement).moveToElement(destElement).release().build().perform();
        actions.dragAndDrop(srcElement, destElement).build().perform();
    }
}

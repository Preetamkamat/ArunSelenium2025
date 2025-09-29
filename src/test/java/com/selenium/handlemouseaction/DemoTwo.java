package com.selenium.handlemouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DemoTwo {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://omayo.blogspot.com/p/page3.html");

        Actions actions = new Actions(driver);
        WebElement minLabelOption = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
       // dragAndDropBy(WebElement, coffset=> positive the move right side and negative for move left side)
        actions.dragAndDropBy(minLabelOption, -47, 0).perform();
    }
}

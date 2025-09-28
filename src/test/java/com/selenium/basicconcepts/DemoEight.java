package com.selenium.basicconcepts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoEight {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().fullscreen();
        Dimension d = new Dimension(800, 600);
        driver.manage().window().setSize(d);
        Thread.sleep(5000);
        driver.quit();
    }
}

package com.selenium.basicconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoSeven {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        String actualPageSourceCode = driver.getPageSource();
        System.out.println(actualPageSourceCode);
        driver.quit();
    }
}

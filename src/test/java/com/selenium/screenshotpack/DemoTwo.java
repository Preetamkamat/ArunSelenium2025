package com.selenium.screenshotpack;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTwo {
    public static void main(String[] args) {
        String browserName = "firefox";
        WebDriver driver = null;
        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Driver not matching");
        }
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com");
        driver.quit();

    }
}

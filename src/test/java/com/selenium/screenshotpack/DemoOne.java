package com.selenium.screenshotpack;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class DemoOne {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com");
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File src = ts.getScreenshotAs(OutputType.FILE);
//        File dest = new File(System.getProperty("user.dir") + "./src/test/java/com/selenium/screenshot/screenshot1.jpg");
//        FileUtils.copyFile(src, dest);

        WebElement element = driver.findElement(By.xpath("//div[@class='widget-content']/img"));

        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(driver);

        // Save screenshot to file
        ImageIO.write(screenshot.getImage(), "PNG", new File(System.getProperty("user.dir") + "./src/test/java/com/selenium/screenshot/fullpage_firefox.png"));

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "./src/test/java/com/selenium/screenshot/screensho12.jpg"));


        src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "./src/test/java/com/selenium/screenshot/screenshot2.jpg"));
        driver.quit();
    }
}

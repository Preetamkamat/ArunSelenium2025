package com.selenium.handledropdownandlistdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoThree {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement listBoxField = driver.findElement(By.id("multiselect1"));

        Select select = new Select(listBoxField);

        select.selectByVisibleText("Audi");
        select.selectByIndex(0);
        select.selectByValue("Hyundaix");

        WebElement option = select.getFirstSelectedOption();

        System.out.println(option.getText());

//		List<WebElement> selectedOptions = select.getAllSelectedOptions();
//
//		for(WebElement option : selectedOptions) {
//			System.out.println(option.getText());
//		}

//		boolean b = select.isMultiple();
//		System.out.println(b);

//		List<WebElement> options = select.getOptions();
//
//		for(WebElement option : options) {
//			System.out.println(option.getText());
//		}
//
        //select.deselectByVisibleText("Volvo");
        //select.deselectByIndex(2);
        //select.deselectByValue("audix");

        //select.deselectAll();

        driver.quit();

    }
}

package com.sample.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {

    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver" , "I:\\Installation Files\\chromedriver.exe");
        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();
        // Launching website
        driver.get("http://google.com/");
        // Initializing the explicit wait
        WebDriverWait exWait = new WebDriverWait(driver, 30);
        // Finding and printing the element
        WebElement element1 = exWait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        System.out.println(element1);
//        // NoSuchElementFound error will throw after 30 sec if element is not matched
//        // Again search for another element
//        WebElement element2 = exWait.until(ExpectedConditions.elementToBeClickable(By.name("abc")));
//        System.out.println(element2);
        // Close the chrome window
        driver.close();
    }
}

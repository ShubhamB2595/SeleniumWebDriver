package com.sample.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver" , "I:\\Installation Files\\chromedriver.exe");
        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();
        // Initializing implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Launching website
        driver.get("http://google.com/");
        // Finding the element for search and searching facebook
        driver.findElement(By.name("q")).sendKeys("facebook");
        // Finding the search button and clicking
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        // Search for searchbar element and clear it
        driver.findElement(By.name("q")).clear();
//        // NoSuchElementFound error will throw after 20 sec if element is not matched
//        // Again search for another element
//        driver.findElement(By.name("abc")).clear();
        // Close the chrome window
        driver.close();
    }
}

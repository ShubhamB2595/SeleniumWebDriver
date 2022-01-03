package com.sample.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverMethods {

    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver" , "I:\\Installation Files\\chromedriver.exe");

        // Calling the webdriver interface method
        //interfaceMethods();
        // Calling find element method
        //findElementMethods();
        // Calling findelements method
        findElements();
    }

    // Method for webdriver interface
    static void interfaceMethods() {

        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();
        // Launching website
        driver.get("http://google.com/");
        // Maximize the browser window
        driver.manage().window().maximize();
        // get the title of page
        System.out.println("The title of page: " + driver.getTitle());
        // get the pagesource
        System.out.println("The pagesource: " + driver.getPageSource());
        // get the current page url
        System.out.println("The current page url: " + driver.getCurrentUrl());
        // get the window handle
        System.out.println("The window handle: " + driver.getWindowHandle());
        // get the window handles
        System.out.println("The window handles: " + driver.getWindowHandles());
        // Navigating to new website
        driver.navigate().to("https://www.facebook.com/");
        // Navigating to previous website
        driver.navigate().back();
        // Navigating to next website
        driver.navigate().forward();
        // Close the chrome window
        driver.close();
    }

    // Method for finding element
    static void findElementMethods() {

        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();
        // Launching website
        driver.get("http://google.com/");
        // Finding the element for search and searching facebook
        driver.findElement(By.name("q")).sendKeys("facebook");
        // Finding the search button and clicking
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        // Close the chrome window
        driver.close();
    }

    // Method for finding all elements
    static void findElements() {

        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();
        // Launching website
        driver.get("https://www.ebay.com/");
        // Initializing the list for storing elements
        List<WebElement> elements = driver.findElements(By.id("gh-btn"));
        // Finding the elements by name
        System.out.println("Number of elements found: " + elements.size());
        // Printing the all attribute of elements
        for (int i=0; i<elements.size(); i++){
            System.out.println(elements.get(i).getAttribute("value"));
        }
        // Close the chrome window
        driver.close();
    }
}
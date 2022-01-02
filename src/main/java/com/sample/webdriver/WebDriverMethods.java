package com.sample.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver" , "I:\\Installation Files\\chromedriver.exe");

        // calling the webdriver interface method
        interfaceMethods();
    }

    // Methods of webdriver interface
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
}
package com.sample.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver" , "I:\\Installation Files\\chromedriver.exe");
        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();
        // Launching website
        driver.get("http://google.com/");
        // Maximize the browser window
        driver.manage().window().maximize();
        // Close the chrome window
        driver.close();
    }
}

package com.sample.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FluentWait {

    public static void main(String[] args) {

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver" , "I:\\Installation Files\\chromedriver.exe");
        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();
        // Launching website
        driver.get("http://google.com/");
        // Initializing the fluent wait
        Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                        .pollingEvery(Duration.ofSeconds(5))
                                .ignoring(Exception.class);

        // Finding and printing the element
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        System.out.println(element);
//        // NoSuchElementFound error will throw after 30 sec if element is not matched
//        // Again search for another element
//        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.name("abc")));
//        System.out.println(element2);
        // Close the chrome window
        //driver.close();
    }
}

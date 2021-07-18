package com.ahmed.tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // find the driver and use that
        WebDriverManager.chromedriver().setup();
       

        // step 2: create driver instance
        WebDriver driver = new ChromeDriver();

        // step 3: invoke get method
        driver.get("https://www.amazon.com");

        // close browser
        driver.close();

        driver.quit();
    	
    	
    }
}

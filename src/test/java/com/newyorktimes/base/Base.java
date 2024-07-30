package com.newyorktimes.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;

import com.newyorktimes.data.DataReading;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends DataReading{
	
	
	@Parameters("browser")

	public void setup(String BrowserName) throws IOException {
		
		loadpropertiesFile();
		
		if(BrowserName.equalsIgnoreCase("Firefox")) {
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver= new FirefoxDriver();
			 driver.get(prop.getProperty("url"));
		} 
		
		else if(BrowserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			 driver.get(prop.getProperty("url"));
		}
		
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver= new EdgeDriver();
			 driver.get(prop.getProperty("url"));
		}
		
        else if(BrowserName.equalsIgnoreCase("Safari")) {
        	 WebDriverManager.chromedriver().setup();
 			 WebDriver driver= new SafariDriver();
 			 driver.get(prop.getProperty("url"));
		}
		
        else {
        	System.out.println("Please enter proper Browser Name");
        }
		
		
	}

}

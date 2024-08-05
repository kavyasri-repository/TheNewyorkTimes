package com.newyorktimes.DriverFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	public static WebDriver getBrowser(String browserName) throws IOException {
		FileReader reader = new FileReader(System.getProperty("user.dir")+"testdata\\config.properties");
		Properties props = new Properties();
		props.load(reader);
		WebDriver driver = null;
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			throw new IllegalArgumentException("Browser " + browserName + " not supported.");
		}
		driver.get(props.getProperty("url"));
		driver.manage().window().maximize();
		return driver;
	}
	public static void closeAllDrivers() {
		// This method can be used to close all driver instances if you keep track of multiple instances
	}
}

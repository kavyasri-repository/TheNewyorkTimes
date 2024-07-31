package com.newyorktimes.DriverFactory;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();	
	public static WebDriver getBrowser(String browserName) {
		WebDriver driver = null;

		switch (browserName) {
		case "Edge":
			driver = drivers.get("Edge");
			if (driver == null) {
				WebDriverManager.chromedriver().setup();
				driver= new EdgeDriver();
				driver.manage().window().maximize();
			}
			break;
		case "Firefox":
			driver = drivers.get("Firefox");
			if (driver == null) {
				WebDriverManager.chromedriver().setup();
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
			}
			break;
		case "Chrome":
			driver = drivers.get("Chrome");
			if (driver == null) {
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				driver.manage().window().maximize();
			}
			break;
		case "Safari":
			driver = drivers.get("Safari");
			if (driver == null) {
				WebDriverManager.chromedriver().setup();
				driver= new SafariDriver();
				driver.manage().window().maximize();
			}
			break;
		}
		return driver;
	}
	public static void closeAllDriver() {
		for (String key : drivers.keySet()) {
			drivers.get(key).close();
			drivers.get(key).quit();
		}

	}
}

package com.newyorktimes.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.newyorktimes.DriverFactory.BrowserFactory;
import com.newyorktimes.data.DataReading;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends DataReading {

	@Parameters("browser")
	@BeforeTest
	public void setup(String BrowserName) throws IOException {

		loadpropertiesFile();
		WebDriver driver = BrowserFactory.getBrowser(BrowserName);
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void tearDown() {
		BrowserFactory.closeAllDriver();
	}
}

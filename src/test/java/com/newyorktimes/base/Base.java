package com.newyorktimes.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.newyorktimes.DriverFactory.BrowserFactory;

public class Base{
	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(@Optional("chrome")String browserName) {
		//prop = new Properties();	
		try {
			driver = BrowserFactory.getBrowser(browserName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}

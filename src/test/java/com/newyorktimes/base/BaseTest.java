package com.newyorktimes.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.newyorktimes.DriverFactory.BrowserFactory;
import com.newyorktimes.data.DataReading;

public class BaseTest extends DataReading{
	

	public WebDriver driver;

	 
	public WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void setupProxy() {

    }


	@Parameters("browser")
	@BeforeTest
	public void setup(@Optional("Chrome")String BrowserName) {
		WebDriver driver = BrowserFactory.getBrowser(BrowserName);
		driver.get(prop.getProperty("url"));
	}
		
	@AfterTest
	public void tearDown() {
		BrowserFactory.closeAllDriver();
	}


}

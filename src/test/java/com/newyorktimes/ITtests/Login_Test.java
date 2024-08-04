package com.newyorktimes.ITtests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.newyorktimes.DriverFactory.BrowserFactory;
import com.newyorktimes.pages.Login_Page;

public class Login_Test {

	private WebDriver driver;
	private Login_Page login;
	@BeforeClass
	public void setUp() throws Exception {
		driver = BrowserFactory.getBrowser("chrome"); // You can parameterize the browser name
		login = new Login_Page(driver);
	}
	@Test
	public void loginTest() {
		login.verifylogin();
	}
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}

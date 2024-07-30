package com.newyorktimes.ITtests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.newyorktimes.base.Base;
import com.newyorktimes.data.DataReading;
import com.newyorktimes.pages.Login_Page;

public class Login_Test extends Base {
	
	WebDriver driver;
	
	
 
	
	@BeforeTest
	public void setup() {
		setup();	
	}
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		Login_Page login = new Login_Page(null);
		
		login.verifylogin();	
	}
	
	@AfterTest
	public void tearDown() {	
		driver.quit();
			
	}
	
}


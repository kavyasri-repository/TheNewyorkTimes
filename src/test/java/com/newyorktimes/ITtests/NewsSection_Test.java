package com.newyorktimes.ITtests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.newyorktimes.pages.Home_Page;

public class NewsSection_Test {

WebDriver driver;
	
	@BeforeTest
	public void setup() {
		setup();	
	}
	
	@Test
	public void verifynewspaperSections() throws InterruptedException, IOException {
		Home_Page home = new Home_Page(null);
		home.verifysectionsonHomepage();	
	}
	
	@AfterTest
	public void tearDown() {	
		driver.quit();
			
	}
}

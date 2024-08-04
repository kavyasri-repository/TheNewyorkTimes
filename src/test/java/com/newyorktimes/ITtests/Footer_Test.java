package com.newyorktimes.ITtests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.newyorktimes.base.Base;
import com.newyorktimes.pages.Home_Page;

public class Footer_Test extends Base {

	private Home_Page footer;
	@BeforeMethod
	public void setUp() {
		// Ensure the WebDriver is initialized in the Base class
		footer = new Home_Page(driver); // Pass WebDriver instance to Home_Page
	}
	@Test
	public void verifyNewspaperSections() {
		footer.verifyFooterLinks();
	}
}

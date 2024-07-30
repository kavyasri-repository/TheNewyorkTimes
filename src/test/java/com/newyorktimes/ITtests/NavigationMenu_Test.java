package com.newyorktimes.ITtests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.newyorktimes.base.Base;
import com.newyorktimes.pages.Home_Page;

public class NavigationMenu_Test extends Base {
	WebDriver driver;

	@Test
	public void verifynewspaperNavigationMenu(){
		Home_Page home = new Home_Page();
		home.verifyNavigationMenu();
	}

}

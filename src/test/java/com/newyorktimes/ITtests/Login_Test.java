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
	
	@Test
	public void loginTest(){
		Login_Page login = new Login_Page();
		try {
			login.verifylogin();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}


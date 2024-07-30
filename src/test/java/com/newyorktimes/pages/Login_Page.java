package com.newyorktimes.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.newyorktimes.data.DataReading;

public class Login_Page extends DataReading{
	
	
	WebDriver driver;
	// here planning to write xpaths or css selectors later
	By EmailID=By.id("Email");
	By Password=By.id("password");
	By Login_Btn=By.id("login");
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}

	
	public void verifylogin() throws InterruptedException, IOException {
		loadpropertiesFile();
		
		driver.findElement(EmailID).clear();
		driver.findElement(EmailID).sendKeys(prop.getProperty("email_id"));
		Thread.sleep(5000);
		driver.findElement(Password).sendKeys(prop.getProperty("password"));
		driver.findElement(Login_Btn).click();
		
	}
	

}

package com.newyorktimes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.newyorktimes.data.DataReading;

public class Login_Page extends DataReading{
	WebDriver driver;
	By Login_Btn=By.xpath("//span[@class='css-ni9it0 e1j3jvdr0']");
	By EmailID=By.xpath("//input[@id='email']");
	By Continue_Btn=By.xpath("//button[normalize-space()='Continue']");
	By Password=By.xpath("//input[@id='password']");
	By CreateAccount_Btn=By.xpath("//button[@type='submit']");

	public void verifylogin()  
	{		
		try {
			driver.findElement(Login_Btn).click();
			driver.findElement(EmailID).sendKeys(prop.getProperty("email_id"));
			driver.findElement(Continue_Btn).click();
			driver.findElement(Password).sendKeys(prop.getProperty("password"));
			driver.findElement(CreateAccount_Btn).click();
		}
		catch(Exception e)
		{
			e.getMessage();
		}	
	}
}
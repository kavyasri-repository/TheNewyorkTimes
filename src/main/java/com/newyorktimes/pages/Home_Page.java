package com.newyorktimes.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.newyorktimes.utilities.Constants;
import com.newyorktimes.utilities.Newspaperdate;

public class Home_Page {
	Newspaperdate date = new Newspaperdate();
	WebDriver driver;

	By datefield = By.xpath("//span[@data-testid='todays-date']");
	By Navigation = By.xpath("//div[contains(@data-testid, 'masthead-container')]/descendant::div[contains(@data-testid, 'masthead-nested-nav')]/nav/ul/li/a");
	By footerArtlinks= By.xpath("//nav[contains(@id, 'site-index')]/div/div/following::div/div/section//h3[contains(text(), 'Arts')]/following::ul/li/a");
	
	public void verifyDateField() {
		WebElement datevariable = driver.findElement(datefield);
		String actualnewsdate = datevariable.getText();
		String expectednewsdate=date.getDayMonthDateYear();
		// Need to write the logic for to get the expected date 	
		Assert.assertEquals(actualnewsdate,expectednewsdate);
	}
	public void verifyNavigationMenu() 
	{	
		List<WebElement> menuElements = driver.findElements(Navigation);
		for (int i = 0; i <= menuElements.size(); i++) {
			String ActualmenuText = menuElements.get(i).getText();
			String ExpectedmenuText = Constants.emenu.get(i);
			Assert.assertEquals(ActualmenuText, ExpectedmenuText);
		}
	}
	public void verifyFooterLinks() 
	{	
		List<WebElement> footer_links = driver.findElements(footerArtlinks);
		
		for (int i = 0; i <= footer_links.size(); i++) {
			String ActualfooterlinkText = footer_links.get(i).getText();
			String ExpectedfooterlinkText = Constants.links.get(i);
		    Assert.assertEquals(ActualfooterlinkText, ExpectedfooterlinkText);
		}
		
		
	}
}

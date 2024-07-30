package com.newyorktimes.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.newyorktimes.utilities.Newspaperdate;


public class Home_Page {
	
	Newspaperdate date = new Newspaperdate();
	
	WebDriver driver;
	

	By Title = By.xpath("");
	By datefield = By.xpath("");
	By Navigation = By.xpath("//div[contains(@data-testid, 'masthead-container')]/descendant::div[contains(@data-testid, 'masthead-nested-nav')]/nav/ul/li/a");
    By footerArtlinks= By.xpath("//nav[contains(@id, 'site-index')]/div/div/following::div/div/section//h3[contains(text(), 'Arts')]/following::ul/li/a");
    		
   
	

	public void verifyDateField() {
		WebElement ad = driver.findElement(datefield); 
		String actualnewsdate = ad.getText();
		String expectednewsdate=date.getDayMonthDateYear();
        // Need to write the logic for to get the expected date 	
		Assert.assertEquals(actualnewsdate,expectednewsdate);

	}

	public void verifyNavigationMenu() {
		
		ArrayList<String> emenu = new ArrayList<String>();
		emenu.add("U.S.");
		emenu.add("World");
		emenu.add("Business");
		emenu.add("Arts");
		emenu.add("Lifestyle");
		emenu.add("Opinion");
		emenu.add("Audio");
		emenu.add("Games");
		emenu.add("Cooking");
		emenu.add("Wirecutter");
		emenu.add("The Athletic");
		
		
		List<WebElement> menuElements = driver.findElements(Navigation);
		for (int i = 0; i <= menuElements.size(); i++) {
		    String ActualmenuText = menuElements.get(i).getText();
		    String ExpectedmenuText = emenu.get(i);
		    Assert.assertEquals(ActualmenuText, ExpectedmenuText);
		}

	}

	public void verifyFooterLinks() {
		
		ArrayList<String> links = new ArrayList<String>();
		links.add("Books");
		links.add("Best Sellers Book List");
		links.add("Dance");
		links.add("Movies");
		links.add("Music");
		links.add("Television");
		links.add("Theater");
		links.add("Visual Arts");
		
		
		List<WebElement> footer_links = driver.findElements(footerArtlinks);
		for (int i = 0; i <= footer_links.size(); i++) {
		    String ActualfooterlinkText = footer_links.get(i).getText();
		    String ExpectedfooterlinkText = links.get(i);
		    Assert.assertEquals(ActualfooterlinkText, ExpectedfooterlinkText);
		}

	}

}

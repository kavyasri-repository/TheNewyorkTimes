package com.newyorktimes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.newyorktimes.utilities.Constants;
import com.newyorktimes.utilities.Newspaperdate;
import java.util.List;

public class Home_Page {
	private WebDriver driver;
	private Newspaperdate date = new Newspaperdate();
	// Locators using @FindBy
	@FindBy(xpath = "//span[@data-testid='todays-date']")
	private WebElement dateElement;
	@FindBy(xpath = "//div[contains(@data-testid, 'masthead-container')]/descendant::div[contains(@data-testid, 'masthead-nested-nav')]/nav/ul/li/a")
	private List<WebElement> navigationMenu;
	@FindBy(xpath = "//nav[contains(@id, 'site-index')]/div/div/following::div/div/section//h3[contains(text(), 'Arts')]/following::ul/li/a")
	private List<WebElement> footerArtLinks;
	// Constructor
	public Home_Page(WebDriver driver) {
		if (driver == null) {
			throw new IllegalArgumentException("WebDriver cannot be null");
		}
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize elements
	}
	public void verifyDateField() {
		try {
			String actualNewsDate = dateElement.getText();
			String expectedNewsDate = Newspaperdate.getDayMonthDateYear();
			Assert.assertEquals(actualNewsDate, expectedNewsDate, "The date displayed is incorrect.");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("An error occurred while verifying the date field: " + e.getMessage());
		}
	}
	public void verifyNavigationMenu() {
		try {
			for (int i = 0; i < navigationMenu.size(); i++) { // Use < instead of <=
				String actualMenuText = navigationMenu.get(i).getText();
				String expectedMenuText = Constants.emenu.get(i);
				Assert.assertEquals(actualMenuText, expectedMenuText, "Navigation menu item mismatch at index " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("An error occurred while verifying the navigation menu: " + e.getMessage());
		}
	}
	public void verifyFooterLinks() {
		try {
			for (int i = 0; i < footerArtLinks.size(); i++) { // Use < instead of <=
				String actualFooterLinkText = footerArtLinks.get(i).getText();
				String expectedFooterLinkText = Constants.links.get(i);
				Assert.assertEquals(actualFooterLinkText, expectedFooterLinkText, "Footer link mismatch at index " + i);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("An error occurred while verifying the footer links: " + e.getMessage());
		}
	}
}

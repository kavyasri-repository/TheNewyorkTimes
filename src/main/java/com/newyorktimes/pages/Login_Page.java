package com.newyorktimes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.newyorktimes.randomdatagenerator.RandomDataGenerator;

import jdk.internal.org.jline.utils.Log;

import java.time.Duration;

public class Login_Page {
	private WebDriver driver;
	// Constructor
	public Login_Page(WebDriver driver) {
		if (driver == null) {
			throw new IllegalArgumentException("WebDriver cannot be null");
		}
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Page Elements
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement Login_Btn;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement EmailID;
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	private WebElement Continue_Btn;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement CreateAccount_Btn;
	private String randomEmail = RandomDataGenerator.generateRandomEmail();
	private String randomPassword = RandomDataGenerator.generateRandomPassword();
	// Method to perform login
	public void verifylogin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			// Wait for the login button to be clickable and click it
			WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(Login_Btn));
			loginButton.click();
			Log.info("Login button clicked.");
			// Wait for the email input field to be visible and enter the email
			WebElement emailField = wait.until(ExpectedConditions.visibilityOf(EmailID));
			emailField.sendKeys(randomEmail);
			Log.info("Email entered.");
			// Wait for the continue button to be clickable and click it
			WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(Continue_Btn));
			continueButton.click();
			Log.info("Continue button clicked.");
			// Wait for the password input field to be visible and enter the password
			WebElement passwordField = wait.until(ExpectedConditions.visibilityOf(Password));
			passwordField.sendKeys(randomPassword);
			Log.info("Password entered.");
			// Wait for the create account button to be clickable and click it
			WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(CreateAccount_Btn));
			createAccountButton.click();
			Log.info("Create account button clicked.");
			// Optional: Verify login success (implement based on your application)
			// WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success-message-id")));
			// Assert.assertTrue(successMessage.isDisplayed(), "Login was not successful");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("An error occurred during the login process: " + e.getMessage());
		}
	}
}

package com.newyorktimes.Listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.newyorktimes.utilities.ExtentManager;
import static com.newyorktimes.utilities.ExtentTestManager.getTest;

public class TestListener extends Base implements ITestListener {
	private WebDriver driver;
	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}
	@Override
	public void onStart(ITestContext iTestContext) {
		System.out.println("I am in onStart method " + iTestContext.getName());
		iTestContext.setAttribute("WebDriver", this.driver);
	}
	@Override
	public void onFinish(ITestContext iTestContext) {
		System.out.println("I am in onFinish method " + iTestContext.getName());
		//Do tier down operations for ExtentReports reporting!
		ExtentManager.extentReports.flush();
	}
	@Override
	public void onTestStart(ITestResult iTestResult) {
		System.out.println(getTestMethodName(iTestResult) + " test is starting.");
	}
	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println(getTestMethodName(iTestResult) + " test is succeed.");
		//ExtentReports log operation for passed tests.
		getTest().log(Status.PASS, "Test passed");
	}
	@Override
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println(getTestMethodName(iTestResult) + " test is failed.");
		//Get driver from BaseTest and assign to local webdriver variable.
		Object testClass = iTestResult.getInstance();
		//  WebDriver driver = ((Base) testClass).getDriver();
		//Take base64Screenshot screenshot for extent reports
		/*   String base64Screenshot =
            "data:image/png;base64," + ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64); */
		//ExtentReports log and screenshot operations for failed tests.
		getTest().log(Status.FAIL, "Test Failed");
		//getTest().addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));
	}
	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println(getTestMethodName(iTestResult) + " test is skipped.");
		//ExtentReports log operation for skipped tests.
		getTest().log(Status.SKIP, "Test Skipped");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
	}
}

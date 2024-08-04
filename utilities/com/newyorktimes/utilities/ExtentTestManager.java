package com.newyorktimes.utilities;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
	// Use ConcurrentMap for better performance in multithreaded scenarios
	private static final ConcurrentMap<Long, ExtentTest> extentTestMap = new ConcurrentHashMap<>();
	private static final ExtentReports extent = ExtentManager.createExtentReports();

	public static ExtentTest getTest() {
		return extentTestMap.get(Thread.currentThread().getId());
	}

	public static ExtentTest startTest(String testName, String desc) {
		ExtentTest test = extent.createTest(testName, desc);
		extentTestMap.put(Thread.currentThread().getId(), test);
		return test;
	}

	public static void endTest() {
		extentTestMap.remove(Thread.currentThread().getId());
	}
}
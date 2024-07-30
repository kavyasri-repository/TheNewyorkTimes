package com.newyorktimes.Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {
	
	public static void main(String args[]) {
	
	TestNG test = new TestNG();
	
	ArrayList<String> suites = new ArrayList<String>();
	
	suites.add("TheNewyorkTimes\\testng.xml");
	
	test.setTestSuites(suites);
	
	test.run();
	
	}
}

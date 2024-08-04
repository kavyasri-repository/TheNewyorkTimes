package com.newyorktimes.utilities;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    
    private static final ConcurrentMap<Long, ExtentTest> extentTestMap = new ConcurrentHashMap<>();
    private static ExtentReports extent = createExtentReports(); // Ensure this initializes correctly

    public static ExtentReports createExtentReports() {
        if (extent == null) {
            String reportPath = "C:\\TheNewyorkTimes\\test-output\\extent-reports\\extent-report.html";
            File reportFile = new File(reportPath);
            reportFile.getParentFile().mkdirs();

            ExtentSparkReporter reporter = new ExtentSparkReporter(reportFile);
            reporter.config().setReportName("Sample Extent Report");
            reporter.config().setDocumentTitle("Test Execution Report");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Blog Name", "SW Test Academy");
            extent.setSystemInfo("Author", "Onur Baskirt");
        }
        return extent;
    }

    public static void flushExtentReports() {
        if (extent != null) {
            extent.flush();
        }
    }
}
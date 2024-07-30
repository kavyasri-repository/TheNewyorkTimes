# TheNewyorkTimes-Automation-Framework
Read Me

Selenium TestNG with JAVA is used in this project for UI Automation.

Imp Notes:

Base file is in src\test\java\Base folder, By using this code we can execute tests in Multiple browsers
TestData files is in src\test\resources\testdata folder
Data reading class files are in src\test\DataReading folder
Integrations test class files in src\test\java  under package name:com.newyorktimes.ITtests 
Page Objects and Page level methods are in src\test\java under package name:com.newyorktimes.pages
Utility classes are in src\test\java under package name:com.newyorktimes.utilities

How to Run this project:

Update maven dependecies.
Under testng.xml place class files to execute
Run as testNg.xml 
tesng reports will get generate in test output folder 
Run through cmd: mvn clean test -Dsurefire.suiteXmlFiles=/path/to/testng.xml
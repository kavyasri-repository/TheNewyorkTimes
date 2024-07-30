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

Test cases written for below scenarios:

1. Verify the login functionality with valid test data

Implementation for the above test case:

created a Login_Test.java class --> created a login_page.java class to store all the methods and locators for the Login_Test.java class --> Read data from data.properties by using DataReading.java file --> In data.properties added URL, email id and password. --> All the browser related information (initialization) added in Base.java file

2.Verify the Navigation Menu on Home page

Implementation for the above test case:

created a NavigationMenu_Test.java class --> created a Home_Page.java class to store all the methods and locators for the NavigationMenu_Test.java class --> All the browser related information (initialization) added in Base.java file -->stored all the menu names in the list and all menu names are stored in web elements list and compared both the lists.

3.Verify the News Date On Home page

Implementation for the above test case:

created a NewsDate_Test.java class --> created a Home_Page.java class to store all the methods and locators for the NewsDate_Test.java class--> All the browser related information (initialization) added in Base.java file --> from calendar returned current date in the form of day--month--date--year and identified date element and get text from the UI and compared expected and actual dates.

4.Verify the Footer links

Implementation for the above test case:

created a Footer_Test.java class --> created a Home_Page.java class to store all the methods and locators for the Footer_Test.java class --> All the browser related information (initialization) added in Base.java file --> stored all the links in the list and from the footer UI - all links are stored in webelements list and compared both the lists. 


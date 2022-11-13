![](https://img.shields.io/github/languages/top/hansamaliWijayatilake/code-challenge-automation) ![](https://badgen.net/github/status/micromatch/micromatch) ![](https://img.shields.io/hackage-deps/v/selenium?style=plastic) ![](https://img.shields.io/cirrus/github/flutter/cocoon?style=plastic) 

# :parachute: How to
* Clone the project
```git
git clone https://github.com/HansamaliWijayatilake/code-challenge-automation.git
```
* Execute the tests :raised_hands: 
```maven
mvn test
```

# :tada: Problem
UI Automation for [patpat.lk](https://www.patpat.lk/) using [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html), [Selenium](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java) and [TestNg](https://mvnrepository.com/artifact/org.testng/testng)
* Covered Flows:
  * Navigate to the https://www.patpat.lk/ webpage 
  * Navigate to the VEHICLES section and select the “Car” type as the vehicle type.
  * Search for a “Used” car with, Manufacturer, Model, Transmission, Year of Manufacturing.
  * Click the first search result and navigate to the advertisement page
  * Confirm that the filtered details (test data) are shown for that car in the advertisement table.

# :zap: Solution
* Data driven approach: **DataProviders** feature is a part of data-driven testing wherein it provides different values to a test case in a single execution. 
It means you can run a single test case once but can execute a method with different data values. 
For instance, you can test the filter functionality with different inputs but you will be executing the test only once. 
TestNG data-providers feature passes all these values to the test case one at a time so that it tests different data sets in a single execution.

* Implementation of PageObjectModel via PageFactory for enabling reusablity of element: **Page Object Model** is a Design Pattern which has become popular in 
Selenium Test Automation. It is widely used design pattern in Selenium for enhancing test maintenance and reducing code duplication.
For every ‘page’ in the application, we create a Page Object to reference the ‘page’ whereas a ‘Page Factory’ is one way of implementing the ‘Page Object Model’. 
So we have used the **PageFactory** implementation of Page Object Model here.

* Helper methods and Utils: Helper methods are provided to perform several actions including menu selections, access values from tables. 

* Cross Browser Support: This test is written in a way where we can execute tests in Chrome, Firefox and Edge. Necessary dependancies are added to the project

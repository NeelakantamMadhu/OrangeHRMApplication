package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OrangeHRMLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
        //Automating chromebrowser
        System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");

        ChromeDriver driver=new ChromeDriver();

        driver.get(applicationURLAddress);

        String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";
        System.out.println("The expetced title of the OrangeHRM Application LogIn page is :-"+expected_OrangeHRMApplicationLogInPageTitle);

        String Actual_OrangeHRMApplicationLogInPageTitle=driver.getTitle();
        System.out.println("The Actual title of the OrangeHRM Application LogIn page is :-"+Actual_OrangeHRMApplicationLogInPageTitle);

        if (Actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle)) 
       {
	       System.out.println("Successfully Navigated to OrangeHRM Application LogIn webpage is- PASS");
	   }
        else {
	System.out.println("Failed to Navigated to OrangeHRM Application logIn webpage is- FAIL");
       }


/*
//   <input name="txtUsername" id="txtUsername" type="text">


< - Tag
input - TagName

name - attribute / locator
txtUsername - corresponding value

id - attribute / locator
txtUsername - corresponding value / selector

type - attribute / its not a locator of WebDriver
 text -  corresponding value / selector

*/
         //   <input name="txtUsername" id="txtUsername" type="text">
        
	      String usernameTestData="Madhu";    //TestData
	     By userNameProperty=By.id("txtUsername");    //Property of an element is identified and assigned to a variable
		 WebElement userName=driver.findElement(userNameProperty);    //Finding a webElement with the property in the current webpage
		 userName.sendKeys(usernameTestData);
		 
		// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		 
		  String passwordTestData="Livetech@123";
          By passwordProperty=By.name("txtPassword");		 
		 WebElement password=driver.findElement(passwordProperty);
		 password.sendKeys(passwordTestData);
		 
	//	 <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		 
		 
		 By logInButtonProperty=By.className("button");
		 WebElement LogInButton=driver.findElement(logInButtonProperty);
		 LogInButton.click();
		 
		 
		 
		 
		 
	}

}

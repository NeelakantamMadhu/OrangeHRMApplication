package com.OrangeHRM;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_LonInTest {

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
	
	
		// 1 Identifying the Element of the Webpage - done using the properites
		driver.findElement(By.id("txtUsername")).sendKeys("Madhu");
	
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.name("txtPassword")).sendKeys("Livetech@123");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.className("button")).click();
		
		//driver.quit();
		
		
		*/
		
		
		
		
		 //   <input name="txtUsername" id="txtUsername" type="text">
	  //  driver.findElement(By.id("txtUsername")).sendKeys("Madhu");
		
	 //	WebElement userName=driver.findElement(By.id("txtUsername"));
	//	userName.sendKeys("Madhu");
		
	     /*
		By userNameProperty=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameProperty);
		userName.sendKeys("Madhu");
		
		*/
		
		
		String userNameTestData="Madhu";   //Test Data
		By userNameProperty=By.id("txtUsername");  //Property of an element is identified and assigned to a variable
		WebElement userName=driver.findElement(userNameProperty);  //Finding a webElement with the property in the current webpage
		userName.sendKeys(userNameTestData);  //Performing an operation on the identified webElement
		
		
	//	<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		String PasswordTestData="Livetech@123";
		By PasswordProperty=By.name("txtPassword");
		WebElement Password=driver.findElement(PasswordProperty);
		Password.sendKeys(PasswordTestData);
		
		
	//	<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		By logInButtonProperty=By.name("Submit");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();
		
		
		
		
		
	}

}

package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWelcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
        //Automating chromebrowser
        System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");

        ChromeDriver driver=new ChromeDriver();

        driver.get(applicationURLAddress);	
		
		String Expected_OrengeHrmHomePageTitle="OrangeHRM";
		System.out.println("The expected title of the OrengeHRM Application HomePage is :- "+Expected_OrengeHrmHomePageTitle);
		
		String Actual_OrengeHrmHomePageTitle=driver.getTitle();
		System.out.println("The Actual title of the OrengeHRM Application HomePage is :- "+Actual_OrengeHrmHomePageTitle);
		
		if (Actual_OrengeHrmHomePageTitle.equals(Expected_OrengeHrmHomePageTitle)) 
		{
			System.out.println("The Title of the OrangeHrm Homepage is Matched - PASS");
		}
		else 
		{
			System.out.println("The Title of the OrangeHrm Homepage is NOT Matched - FAIL");
		}
		
		
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
		 
		
   //     <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		
		  By WelcomeButtonProperty=By.className("panelTrigger");
		  WebElement WelcomeButton=driver.findElement(WelcomeButtonProperty);
		  WelcomeButton.click();
		
		
		
		
		
		
	}

}

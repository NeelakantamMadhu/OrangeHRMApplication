package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.ResourceService.WelcomeFactory;

import com.OHRM.AutomateWelcome;

public class Assignment2_OHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
		
		driver.get(applicationUrlAddress);
		
		
		// Validating the WebPage 
		   //Expected Title - OrangeHRM (should be same)
		
		String expected_OrangeHrmLogInPageTitle="OrangeHRM";
		System.out.println("The Expected OrangeHrm logIn Page Title is :- "+expected_OrangeHrmLogInPageTitle);
		
		 // of the current webpage - identifying the Title
		
		String actual_OrangeHrmLogInPageTitle=driver.getTitle();
		System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+actual_OrangeHrmLogInPageTitle);
		
		
		if (actual_OrangeHrmLogInPageTitle.equals(expected_OrangeHrmLogInPageTitle)) 
		{
			System.out.println("The Title of the OrangenHRM logIn page Matched - PASS");
		}
		else {
			System.out.println("The Title of the OrangenHRM logIn page NOT Matched - FAIL");
		}
		
	//	driver.close();
		
		System.out.println();
		
		//**** Expected URL - orangehrm-4.2.0.1 (should have)
		
		String expected_OrangeHrmLogInPageURL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.out.println("The Expected OrangeHrm LogIn page URL is :- "+expected_OrangeHrmLogInPageURL);
		
		 //of the current webpage - identifying the URL
		
		String actual_OrangeHrmLogInPageURL=driver.getCurrentUrl();
		System.out.println("The Actual OrangeHrm LogIn page URL is :- "+actual_OrangeHrmLogInPageURL);
		
		if (actual_OrangeHrmLogInPageURL.equals(expected_OrangeHrmLogInPageURL)) 
		{
			System.out.println("Successfully Navigated to OrangeHrm LogIn Page URL Address Matched - PASS");
		}
		else {
			System.out.println("Failed Navigated to OrangeHrm LogIn Page URL Address NOT Matched - FAIL");
		}
		
		System.out.println("_____________________________________________________________________");
		
		
		
		
		System.out.println("________________________________________________________________________");
		
		//**** Expetced Text - LOGIN Panel (should be same)
		
		
	//	<div id="logInPanelHeading">LOGIN Panel</div>
		
		
		String expected_OrangeHrmLogInPanel="LOGIN Panel";
		System.out.println("The Expected OrangeHrm logIn Page LOGIN Panel is :- "+expected_OrangeHrmLogInPanel);
		
		
		// of the current webpage - identifying the LOGIN Panel
		
				
			
				By OrangeHrmLogInPanelProperty=By.id("logInPanelHeading");
				WebElement OrangeHrmLogInPanel=driver.findElement(OrangeHrmLogInPanelProperty);
				
				String actual_OrangeHrmLogInPanel=OrangeHrmLogInPanel.getText();
				System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+OrangeHrmLogInPanel);
				
			
				if (expected_OrangeHrmLogInPanel.equals(actual_OrangeHrmLogInPanel))
				{
					System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel Matched - PASS");
				}
				else {
					System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
				}
		
		
		
				System.out.println();
				
				
				
				
				
				
				//******* LogIn with Validted Test Data
		
		

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
				 
				 
				 		
		
		
		
		         //******** Validating the HomePage 
		          // Expeced Title - OrangeHRM (should be same)
		
		
				 String expected_OrangeHrmHomePageTitle="OrangeHRM";
				 System.out.println("The Expected OrangeHrm logIn Page Title is :- "+expected_OrangeHrmHomePageTitle);
					
				// of the current webpage - identifying the Title
					
					String actual_OrangeHrmHomePageTitle=driver.getTitle();
					System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+actual_OrangeHrmHomePageTitle);
					
					
					if (actual_OrangeHrmHomePageTitle.equals(expected_OrangeHrmHomePageTitle)) 
					{
						System.out.println("The Title of the OrangenHRM Home page Matched - PASS");
					}
					else {
						System.out.println("The Title of the OrangenHRM Home page NOT Matched - FAIL");
					}
					
					Thread.sleep(5000);
					
			//*********** Expected Text - Welcome (should have)		
					
					
				//	<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
					
					By welcomeAdminProperty=By.linkText("Welcome Admin");
					WebElement welcome=driver.findElement(welcomeAdminProperty);
					
					
					String welcomeHrefAttributeValue=welcome.getAttribute("href");
					System.out.println("The href Attribute value of welcome webElement is :- "+welcomeHrefAttributeValue);
					
					// Performing click on the Welcome WebElement 
				
					
					
					String webpageUrlAddress=driver.getCurrentUrl();
					System.out.println("The webpage URL Address is :- "+webpageUrlAddress);
					
					//if (webpageUrlAddress.contains(welcomeHrefAttributeValue))
					if (welcomeHrefAttributeValue.contains(webpageUrlAddress))
					{
						System.out.println("Url is Matched - PASS");
						
					}
					else {
						System.out.println("Url is NOT Matched - FAIL");
					}
					
					welcome.click();
					
					Thread.sleep(5000);
					
					//__________________________or___________________________
					
					System.out.println("____________________or______________");
					
					
			/*		
			//		<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
					 welcomeAdminProperty=By.partialLinkText("Admin");
					WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
					
					String expected_OrangeHrmHomePageWelcomeButton="Welcome";
					System.out.println("The Expected OrangeHrm Homepage Welcome Button is :- "+expected_OrangeHrmHomePageWelcomeButton);
					
			    	String actual_OrangeHrmHomePageWelcomeButton=welcomeAdmin.getText();
					System.out.println("The actual OrangeHrm Homepage Welcome Button is :- "+actual_OrangeHrmHomePageWelcomeButton);
					
					if (actual_OrangeHrmHomePageWelcomeButton.contains(expected_OrangeHrmHomePageWelcomeButton)) 
					{
						System.out.println("The Welcome link of the OrangeHrm Homepage is Matched - PASS");
					}
					else {
						System.out.println("The Welcome link of the OrangeHrm Homepage is NOT Matched - FAIL");
					}
					
					welcomeAdmin.click();
				*/	
					
					
					
					
					
					
					
					
					// Automate logOut
					
					Thread.sleep(5000);
					
					
					// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
						
					 
					  
					  By LogoutButtonProperty=By.linkText("Logout");
					  WebElement LogoutButton=driver.findElement(LogoutButtonProperty);
					  LogoutButton.click();
					  
					
					  
					//_____________________________________________________
						
						System.out.println("__________________________________");
						
						
					// Navigate to OrangeHrm Application LogInPage
					
					//Expected Title - OrangeHRM (should be same)
						
						 expected_OrangeHrmLogInPageTitle="OrangeHRM";
						System.out.println("The Expected OrangeHrm logIn Page Title is :- "+expected_OrangeHrmLogInPageTitle);
						
						 // of the current webpage - identifying the Title
						
						 actual_OrangeHrmLogInPageTitle=driver.getTitle();
						System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+actual_OrangeHrmLogInPageTitle);
						
						
						if (actual_OrangeHrmLogInPageTitle.equals(expected_OrangeHrmLogInPageTitle)) 
						{
							System.out.println("The Title of the OrangenHRM logIn page Matched - PASS");
						}
						else {
							System.out.println("The Title of the OrangenHRM logIn page NOT Matched - FAIL");
						}
						
					//	driver.close();
						
						System.out.println();
						
						//**** Expected URL - orangehrm-4.2.0.1 (should have)
						
						 expected_OrangeHrmLogInPageURL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
						System.out.println("The Expected OrangeHrm LogIn page URL is :- "+expected_OrangeHrmLogInPageURL);
						
						 //of the current webpage - identifying the URL
						
						 actual_OrangeHrmLogInPageURL=driver.getCurrentUrl();
						System.out.println("The Actual OrangeHrm LogIn page URL is :- "+actual_OrangeHrmLogInPageURL);
						
						if (actual_OrangeHrmLogInPageURL.equals(expected_OrangeHrmLogInPageURL)) 
						{
							System.out.println("Successfully Navigated to OrangeHrm LogIn Page URL Address Matched - PASS");
						}
						else {
							System.out.println("Failed Navigated to OrangeHrm LogIn Page URL Address NOT Matched - FAIL");
						}
						
						System.out.println();
					
					
						System.out.println("________________________________________________________________________");
						
						//**** Expetced Text - LOGIN Panel (should be same)
						
						
					//	<div id="logInPanelHeading">LOGIN Panel</div>
						
						
						 expected_OrangeHrmLogInPanel="LOGIN Panel";
						System.out.println("The Expected OrangeHrm logIn Page LOGIN Panel is :- "+expected_OrangeHrmLogInPanel);
						
						
						// of the current webpage - identifying the LOGIN Panel
						
						
						
						 OrangeHrmLogInPanelProperty=By.id("logInPanelHeading");
						 OrangeHrmLogInPanel=driver.findElement(OrangeHrmLogInPanelProperty);
						
						 actual_OrangeHrmLogInPanel=OrangeHrmLogInPanel.getText();
						System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+OrangeHrmLogInPanel);
						
					
						if (expected_OrangeHrmLogInPanel.equals(actual_OrangeHrmLogInPanel))
						{
							System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel Matched - PASS");
						}
						else {
							System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
						}		
						
						
					driver.close();
					
			
					
					
					
					
					
					
					
					
					
					
					
		
		
		
		
		
		
	}

}

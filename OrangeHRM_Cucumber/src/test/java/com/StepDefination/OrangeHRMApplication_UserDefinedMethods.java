package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplication_UserDefinedMethods {
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	
	public OrangeHRMApplication_UserDefinedMethods(Hooks madhu) {
		
		driver=madhu.driver;
		
	}
	
	
	
	
	
	
	
	@Given("User should open Browser in the System")
	public void user_should_open_browser_in_the_system() {
	 /*
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	    driver=new ChromeDriver();
	  
	 Log.info("********** Chrome Browser launched Successfully *********");  
	  
	  */
	}

	@When("User enter OrangeHRM Application URL Address")
	public void user_enter_orange_hrm_application_url_address() {
		
		driver.get(applicationUrlAddress);
		Log.info("******* Sucessfully Provided OrangeHRM Application Url Address on the Browser ***********");
		
		driver.manage().window().maximize();
	    
	}

	@Then("User should be navigated to OrangeHRM Application LogIn WebPage")
	public void user_should_be_navigated_to_orange_hrm_application_log_in_web_page() {
		
		String expected_OrangeHRMAplicationLogInPageTitle="OrangeHRM";
		Log.info(" The expected title of the OrangeHRm Application LogIn Page is :- "+expected_OrangeHRMAplicationLogInPageTitle);

		String actual_OrangeHRMAplicationLogInPageTitle=driver.getTitle();
		Log.info(" The actual title of the OrangeHRm Application LogIn Page is :- "+actual_OrangeHRMAplicationLogInPageTitle);

		if(actual_OrangeHRMAplicationLogInPageTitle.equals(expected_OrangeHRMAplicationLogInPageTitle))
		{
		Log.info("Successfully Navigated to OrangeHRM Application LogIn WebPage - PASS");
		}
		else
		{
		Log.info("Failed to Navigate to OrangeHRM Application LogIn WebPage - FAIL");
		}


		// Validating Text - LOGIN Panel

		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		Log.info(" The Expected Text of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageText);

		// id="logInPanelHeading"
		By orangeHRMApplicationLogInPageTextProperty=By.id("logInPanelHeading");
		WebElement orangeHRMApplicationLogInPage=driver.findElement(orangeHRMApplicationLogInPageTextProperty);

		String actual_OrangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPage.getText();
		Log.info(" The Actual Text of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageText);

		if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
		Log.info(" Text Found - Successfully Navigated to OrangeHRM Application LogIn Page - PASS ");
		}
		else
		{
		Log.info(" Expected LogIn Page Text Not Found - Failed to Navigate to OrangeHRM Application LogIn Page - FAIL");
		}
		 
	    
	}

	@Then("User should close the OrangeHRM Application along with the browser")
	public void user_should_close_the_orange_hrm_application_along_with_the_browser() {
	    
		driver.close();
		
		Log.info(" ***********  OrangeHRM Application along with the Browser closed Successfully ***********");
		
		
		
	}
	
	
	
	@When("^User enters OrangeHRM Application URL Address$")
	public void user_enters_OrangeHRM_Application_URL_Address()  {
		
		
		driver.get(applicationUrlAddress);
		Log.info("******* Sucessfully Provided OrangeHRM Application Url Address on the Browser ***********");
		
		driver.manage().window().maximize();
		
	   
	}

	
	@Then("^User should enter \"([^\"]*)\"and \"([^\"]*)\" and click on login button$")
	public void user_should_enter_and_and_click_on_login_button(String userName, String password) {
	   
		// name="txtUsername"
			//	String userNameTestData="Madhu";//Test Data
				By userNameProperty =By.name("txtUsername"); // Property of an element is identified and assigned to a variable 		
				WebElement UserName=driver.findElement(userNameProperty);// finding a WebElement with the property in the current WebPage
				UserName.sendKeys(userName);// Performing an operation on the identified WebElement 
				
				// name="txtPassword"
				String passwordTestData="Livetech@123";
				By passwordProperty=By.name("txtPassword");
			    WebElement Password=driver.findElement(passwordProperty);
			    Password.sendKeys(password);
			    
			    // id="btnLogin"
			    By logInButtonProperty=By.id("btnLogin");
			    WebElement logInButton=driver.findElement(logInButtonProperty);
			    logInButton.click();
		
		
		
	}

	
	
	
	@Then("^User should enter userName and password and click on login button$")
	public void user_should_enter_userName_and_password_and_click_on_login_button() {
		
		// name="txtUsername"
		String userNameTestData="Madhu";//Test Data
		By userNameProperty =By.name("txtUsername"); // Property of an element is identified and assigned to a variable 		
		WebElement userName=driver.findElement(userNameProperty);// finding a WebElement with the property in the current WebPage
		userName.sendKeys(userNameTestData);// Performing an operation on the identified WebElement 
		
		// name="txtPassword"
		String passwordTestData="Livetech@123";
		By passwordProperty=By.name("txtPassword");
	    WebElement password=driver.findElement(passwordProperty);
	    password.sendKeys(passwordTestData);
	    
	    // id="btnLogin"
	    By logInButtonProperty=By.id("btnLogin");
	    WebElement logInButton=driver.findElement(logInButtonProperty);
	    logInButton.click();
	   
	}

	@Then("^User should be navigated to OrangeHRM Application HomePage$")
	public void user_should_be_navigated_to_OrangeHRM_Application_HomePage()  {
		
		
		By welComeAdminProperty=By.partialLinkText("Admin");

		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);

		String expected_OrangeHRMApplicationHomePageText="Welcome";
		System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS ");
		}
		else
		{
		System.out.println("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
		}


	   
	}

	@Then("^User should click on WelCome Admin and click on Logout$")
	public void user_should_click_on_WelCome_Admin_and_click_on_Logout() throws InterruptedException   {
		
		
		
		By welComeAdminProperty=By.partialLinkText("Admin");

		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		welComeAdmin.click();

		Thread.sleep(5000);


		By logOutProperty=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

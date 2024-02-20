package com.OrangeHRMApplicationPageTests;



import java.io.IOException;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

import OrangeHRMApplicationPages.LogInPage;

public class LogInPageTest extends BaseTest{

	
   @Test(priority = 1,description = " Validating OrangeHRMApplication LogIn Page Text ")
	public void orangeHMRApplicationLogInPage_logInPannelText_Test() {
		
		LogInPage logInPage=new LogInPage();
		
		logInPage.orangeHRMApplicationLogInPage_logInPannelTextValidation();
		
	}
	
	@Test(priority = 2,description = " Validation OrangeHRM Application LogIn Page Logo")
   public void orangeHRMApplicationLogInPage_LogoValidationTest() {
	   
	   LogInPage logInPage=new LogInPage();
	   
	   logInPage.orangeHRMApplicationLogInPageLogoValidation();
}
	
	
	@Test(priority = 3,description = " Validation OrangeHRM Application LogIn Functionality")
	public void orangeHRMApplicationLogInPage_LogInTest() throws IOException, InterruptedException {
		
	   LogInPage logInPage=new LogInPage();
	   logInPage.orangeHRMApplicationLodInPage_logInValidation("userNameTestData","userNamePassword" );
		
	}
	
	
	
	
	
	
	
}

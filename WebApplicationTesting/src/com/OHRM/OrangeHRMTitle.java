package com.OHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
        //Automating chromebrowser
        System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");

        ChromeDriver driver=new ChromeDriver();

        driver.get(applicationURLAddress);	
		
		String Expected_OrengeHRMApplicationLoginPageTitle="OrangeHRM";
		System.out.println("The expected title of the OrengeHRM Application Login Page is :- "+Expected_OrengeHRMApplicationLoginPageTitle);
		
		String Actual_OrangeHRMApplicationLoginPageTitle=driver.getTitle();
		System.out.println("The Actual title of the OrengeHRM Application Login Page is :- "+Actual_OrangeHRMApplicationLoginPageTitle);
		
		if (Actual_OrangeHRMApplicationLoginPageTitle.equals(Expected_OrengeHRMApplicationLoginPageTitle)) 
		{
			System.out.println("Successfully Navigative to OrengeHRM Application Login Webpage - PASS");
		}
		else 
		{
			System.out.println("Failed to Navigative to OrangeHRM Application Login Webpage - FAIL");
		}
		
		
		
		
		
		
		
		
		
		
	}

}

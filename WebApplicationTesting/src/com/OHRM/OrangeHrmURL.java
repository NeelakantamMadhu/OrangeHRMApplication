package com.OHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String OrangeHRMApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
        //Automating chromebrowser
        System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");

        ChromeDriver driver=new ChromeDriver();

        //Navitage to OrangeHRM URL Address
        driver.get(OrangeHRMApplicationURLAddress);
         
     //   http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login  -  Should be 
		
		
		String Expected_OrangeHrmURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.out.println("The Exceped URL Address of the OrangeHRM LogInPage - "+Expected_OrangeHrmURLAddress);
		
		String Actual_OrangeHrmURLAddress=driver.getCurrentUrl();
		System.out.println("The Actual URL Address of the OrangeHRM LogInPage - "+Actual_OrangeHrmURLAddress);
		
		
		
		if (Actual_OrangeHrmURLAddress.equals(Expected_OrangeHrmURLAddress))
        {
			System.out.println("The URL of the OrangeHRM LogInPage matched - PASS");
		}
		else {
			System.out.println("The URL of the OrangeHRM LogInPage NOT Matched - FAIL");
		}
		
		
	}

}

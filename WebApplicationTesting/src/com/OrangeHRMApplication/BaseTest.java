package com.OrangeHRMApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;



public class BaseTest {
	
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("*********** Chrome Browser Launched successfully **********");
		Log.info("*********** Chrome Browser Launched successfully **********");
		
		driver.get(applicationUrlAddress);
		System.out.println("******* Successfully Navigated to OrangeHRM Application **********");
		Log.info("******* Successfully Navigated to OrangeHRM Application **********");
		
		driver.manage().window().maximize();
    }
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		System.out.println("******** Chrome Browser Along with OrangeHRM Application Closed Successfully ***********");
		Log.info("******** Chrome Browser Along with OrangeHRM Application Closed Successfully ***********");
		
	}
	
	
	
	

}
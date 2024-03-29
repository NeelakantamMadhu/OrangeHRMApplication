package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;



import com.Utility.Log;

public class BaseTest {
	
	public static WebDriver driver;
	String applictaionUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		Log.info("*********** Chrome Browser Launcched Successfully **********");
		
		driver.get(applictaionUrlAddress);
		
		Log.info(" ****** Successfully Navigated to OrangeHRM Application LogIn Page ****** ");
		
		driver.manage().window().maximize();
		
		
	}

}

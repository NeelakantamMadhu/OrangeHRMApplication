package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	
	public static WebDriver driver;
	
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		Log.info("********** Chrome Browser launch Successfully **********");
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
		
		Log.info("***** Browser Close with Application Successfully **********");
		
	}
	
	
}

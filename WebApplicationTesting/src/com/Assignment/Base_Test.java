package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_Test {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
	}
	
	

}

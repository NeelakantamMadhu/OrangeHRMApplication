package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class LanuchBrowser {
	
	
	public WebDriver driver;
	
	String applictaionUrlAddress="http://instagram.com";
	
	@Test
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 driver.get(applictaionUrlAddress);
		 driver.manage().window().maximize();
		 
	}

}

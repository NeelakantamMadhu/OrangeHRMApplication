package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_BingHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
	//Automating ChromeBrowser
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver chromeBrowsers=new ChromeDriver();
		
		
		//Navigating to Bing Application HomePage
		
		chromeBrowsers.get("http://bing.com");
		 
		String expected_BingHomePageTitle="Bing";   //should Be Bing
		System.out.println("The Expected Bing homepage Title is :-"+expected_BingHomePageTitle);
		
		// Of the current webpage - identifying the Title
		String actual_webpageTitle=chromeBrowsers.getTitle();
		
		System.out.println("The Actual webpage Title is:-"+actual_webpageTitle);
		
		if (actual_webpageTitle.equals(expected_BingHomePageTitle)) 
		{
		
		System.out.println("The Title of the Bing Home Page Matched- PASS");	
			
		}
		else {
			System.out.println("The Title of the Bing Home Page NOT Matched- FAIL");
		}
		 
		chromeBrowsers.close();
		*/
		
System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver chromeBrowsers1=new ChromeDriver();
		
		
		//Navigating to Bing Application HomePage
		
		chromeBrowsers1.get("http://youtube.com");
		 
		String expected_youtubeHomePageTitle="Youtube";   //should Be youtube
		System.out.println("The Expected youtube homepage Title is :-"+expected_youtubeHomePageTitle);
		
		// Of the current webpage - identifying the Title
		String actual_webpagesTitle=chromeBrowsers1.getTitle();
		
		System.out.println("The Actual webpage Title is:-"+actual_webpagesTitle);
		
		if (actual_webpagesTitle.equals(expected_youtubeHomePageTitle)) 
		{
		
		System.out.println("The Title of the youtube Home Page Matched- PASS");	
			
		}
		else {
			System.out.println("The Title of the youtube Home Page NOT Matched- FAIL");
		}
		 
		chromeBrowsers1.close();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

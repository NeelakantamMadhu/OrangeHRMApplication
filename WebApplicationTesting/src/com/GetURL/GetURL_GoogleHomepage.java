package com.GetURL;

import org.openqa.selenium.chrome.ChromeDriver;



public class GetURL_GoogleHomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          //Automating ChromeBrowser
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		
	    ChromeDriver chromeBrowser =new ChromeDriver();
	   
	    //Navigating to Google Application HomePage
			
		chromeBrowser.get("http://google.com");
		
		  //Getting the URL Address of the current webpage
		String googleCurrentWebPageURLAddress=chromeBrowser.getCurrentUrl();
		
		System.out.println("The current URL Address of the webpage is :-"+googleCurrentWebPageURLAddress);
		
		chromeBrowser.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

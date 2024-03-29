package com.ValidatingURLAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingURLAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Automating ChromeBrowser
		
				System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
				
			    ChromeDriver chromeBrowser =new ChromeDriver();
			   
			    //Navigating to Google Application HomePage
					
				chromeBrowser.get("http:/google.com");
				
				//google.com- should have in the URL Address
				
				String Expected_GoolgleHomepageURLAddress="google.com";
				System.out.println("The Expected URL Address of the Google Homepage is:- "+Expected_GoolgleHomepageURLAddress);
				
		// Getting the URL Address of the current webpage
				
				String Actual_googleCurrentWebpageURLAddress=chromeBrowser.getCurrentUrl();
		
                System.out.println("The Actual Current URL Address of the webpage is:-"+Actual_googleCurrentWebpageURLAddress);		
		
		
		if (Actual_googleCurrentWebpageURLAddress.contains(Expected_GoolgleHomepageURLAddress)) {
		
			System.out.println("Successsfully Navigated to Google Homepage - URL Address found - PASS");
			
		}
		else {
			System.out.println("Failed to Navigated Google Homepage - URL Address NOT found - FAIL");
		}
		
		
		chromeBrowser.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

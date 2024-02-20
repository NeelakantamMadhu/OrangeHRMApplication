package com.ApplicationLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigativeTo_Bing_Homepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Automating Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		  //Object      Class
		ChromeDriver chromebrowser=new ChromeDriver();
		
		//Navigating to Bing Application HomePage
		chromebrowser.get("http://bing.com");
		
		// ChromeBrowser- Which is an Object always points to Current Browser
		
		chromebrowser.get("http://instagram.com");
		
		//chromebrowser.get("http://bing.com");  //will open in the same browser of the same tab
		
		chromebrowser.get("http://gmail.com");
		
		//chromebrowser.close(); //close method will close the browser when it has a single Tab opened
		
		chromebrowser.quit();      // Quit method will close the browser when it is and also closes
		  //Opened with single Tab      /  the Browser Opened with Multiple Tab's
		
		
		
		
		
	}

}

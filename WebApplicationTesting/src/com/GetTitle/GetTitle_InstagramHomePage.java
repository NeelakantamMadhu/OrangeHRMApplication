package com.GetTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_InstagramHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Automating ChromeBrowser
		
		System.setProperty("webdriver.chrome.driver",  "./BrowserDriverFiles/chromedriver.exe");
		
		ChromeDriver ChromeBrowser = new ChromeDriver();
		
		//Navigating to Instagram Application HomePage
		ChromeBrowser.get("http://instagram.com");
		
		  //Of the current WebPage - Identifying the Title
		String instagramTitle=ChromeBrowser.getTitle();  //The identifying title is assigned to a variable "instagramTitle"
		
		System.out.println("The Title of the Instagram current webpage is:-"+instagramTitle);
		
		//ChromeBrowser.quit();
		
		
		System.out.println("__________________________************_______________");
		
		
		//Navigating to Youtube Application HomePage
		
		ChromeBrowser.get("http://youtube.com");
		
		   //of the current webpage - Identifying the Title
		String youtubeTitle=ChromeBrowser.getTitle();
		
		System.out.println("The title of the Youtube current webpage is:-" +youtubeTitle);
		
		
		ChromeBrowser.quit();
		
		
		
	}

}

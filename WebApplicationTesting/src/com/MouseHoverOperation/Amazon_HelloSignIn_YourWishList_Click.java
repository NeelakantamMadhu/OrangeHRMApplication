package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_YourWishList_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
String applicationUrlAddress="http://amazon.in";
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		// <a href="/hz/wishlist/ls?requiresSignIn=1&amp;ref_=nav_AccountFlyout_wl" class="nav-link nav-item"><span class="nav-text">Your Wish List</span></a>
		// <a href="/hz/wishlist/ls?requiresSignIn=1&amp;ref_=nav_AccountFlyout_wl" class="nav-link nav-item"><span class="nav-text">Your Wish List</span></a>

		// id="nav-link-accountList" - Property of Hello SignIn WebElement Element
		By helloSignInProperty=By.id("nav-link-accountList");
		WebElement helloSignIn=driver.findElement(helloSignInProperty);



		// Mouse Hover Operation on the Hello Sign In WebElement
		//  Either to Work with Mouse of Keyboard related function keys - use Actions Class

		// Making the WebDriver to find work on Hello Sign In and then Operation on
//		              

		Actions mouseHoverOperation = new Actions(driver);
		mouseHoverOperation.moveToElement(helloSignIn).build().perform();


		// WebDriver cannot directly automate any Hidden/Invisible element - but can automate
//		    the Hidden WebElement when the Element is made visible to the WebDriver

		By yourWishListProperty=By.linkText("Your Wish List");
		WebElement yourWishList=driver.findElement(yourWishListProperty);

		yourWishList.click();

		String yourWishListWebPageTitle=driver.getTitle();
		System.out.println(yourWishListWebPageTitle);

		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

	
	}



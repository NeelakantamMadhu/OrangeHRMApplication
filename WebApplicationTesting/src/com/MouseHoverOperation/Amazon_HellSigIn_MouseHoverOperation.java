package com.MouseHoverOperation;

import java.awt.Desktop.Action;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Amazon_HellSigIn_MouseHoverOperation {

	private static final int Perform = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String applicationUrlAddress="http://amazon.in";
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		
		//<span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span>
		
		
		By helloSigInProperty=By.id("nav-link-accountList-nav-line-1");
		WebElement helloSigIn=driver.findElement(helloSigInProperty);
		Actions mouseHoverOperation=new Actions(driver);
		mouseHoverOperation.moveToElement(helloSigIn, bulid(), Perform());
		
	}

	private static int Perform() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int bulid() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	
}

package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bin_Homepage_CapturingScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String applicationUrlAddress="http://bing.com";
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		//TakesScreenShot - its an interface
		//driver - is an object of a class/ interface
		//((TakeScreenShot)driver) - this process is referred to as Type Casting
		
		File webPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(webPageScreenShot, new File("./ScreenShot/bingHomepageScreenShot.png"));
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

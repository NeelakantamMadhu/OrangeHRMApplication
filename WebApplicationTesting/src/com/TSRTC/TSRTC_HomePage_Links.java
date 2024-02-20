package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		/*


		<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
		<a href="/oprs-web/home/privacy.do" title="Privacy Policy">Privacy Policy</a>

		<input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">
		<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">

		*/
		
		//Whenever we work on a group of similar type of WebElement - then look for a common property
		
		//Existing amoung them 
		
		//Since we are working on a group of Elements of Type links
		
		//The common property existing amoung them is = 'a' anchor tag
		
		
		
		By linksProperty=By.tagName("a");
		List<WebElement>tsrtcApplicationHomePageLinks=driver.findElements(linksProperty);
		
		 int tsrtcApplicationHomePageLinks_Count=tsrtcApplicationHomePageLinks.size();
		
		
		     System.out.println("The number of WebElement which are of the type links on the TSRTC Application Home Page is  :-  " +tsrtcApplicationHomePageLinks_Count);
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

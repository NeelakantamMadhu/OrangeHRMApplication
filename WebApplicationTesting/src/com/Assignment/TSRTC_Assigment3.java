package com.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TSRTC_Assigment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		      String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress); 
		
		
		// Successfully Navigated TSRTC Home page
		
		
		/*
		     <div class="menu">
			<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
					Home</a>
				<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
				<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
				<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
				<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
				<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
				<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
				<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
</div>
		   
		   
		 */
		
		
		                By LinksProperty1=By.className("menu");
		            WebElement  TSRTCHomePageHeaderLinks=driver.findElement(LinksProperty1);
		
		
	
	                    	By LinksProperty =By.tagName("a");
		                 List<WebElement>TSRTCHomePageHeaderLink=TSRTCHomePageHeaderLinks.findElements(LinksProperty);
		                 
		                 
		                 int TSRTCHomePageHeaderLinks_Count=TSRTCHomePageHeaderLink.size();
		                 
		                 System.out.println("The number of WebElements which are of type  link on the TSRTC Home Page Green Bar Links is :-  "+TSRTCHomePageHeaderLinks_Count);
		                 
		                 for(int arrayindex=0;  arrayindex<TSRTCHomePageHeaderLinks_Count;  arrayindex++) 
		                 {
		                	 String TSRTCHomePageGreenBar_LinkNames=TSRTCHomePageHeaderLink.get(arrayindex).getText();
		                	 
		                	 System.out.println(arrayindex +"  _  "+TSRTCHomePageGreenBar_LinkNames);
		                	 
		                	
		                	 TSRTCHomePageHeaderLink.get(arrayindex).click();
		                	 
		                	System.out.println(driver.getTitle());
		                	System.out.println(driver.getCurrentUrl());
		                	System.out.println();
		                	driver.navigate().back();
		                	
				              TSRTCHomePageHeaderLinks=driver.findElement(LinksProperty1);
				      
				              TSRTCHomePageHeaderLink=TSRTCHomePageHeaderLinks.findElements(LinksProperty);
				              
				              
		                	 
				              TSRTCHomePageHeaderLinks_Count=TSRTCHomePageHeaderLink.size();
				                 System.out.println("The current size of the Array list is :-"+TSRTCHomePageHeaderLinks_Count); 
		                	 
		                 }
		
		
		 driver.quit();
		
		                 
		                 System.out.println("_______________________________________________________________________-");
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

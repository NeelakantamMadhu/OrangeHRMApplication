package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OsmaniaUniversity_SelectLanguage {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";
	
	
	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(applicationUrlAddress);
	
	//Maximizing the Browser
	driver.manage().window().maximize();
	
	
	// Identifying the Select Languages DropDown Property
	// id="gtranslate_selector"
	
	By selectLanguagesDropDownProperty=By.id("gtranslate_selector");
    WebElement selectLanguage=driver.findElement(selectLanguagesDropDownProperty);
    
    
    // <option value="en|fr">French</option>
    // <option value="en|de">German</option>
    // <option value="en|ur">Urdu</option>
    
    By dropDownProperty= By.tagName("option");
    List<WebElement> dropDownSelectLanguages=selectLanguage.findElements(dropDownProperty);

	int dropDown_Count=dropDownSelectLanguages.size();
	System.out.println("The number of languages in the select languages drop down is :-  "+dropDown_Count);
	
	
	
	
	for(int index=0; index<dropDown_Count; index++)
	{
	 	String languageNames=dropDownSelectLanguages.get(index).getText();
		System.out.println(index +"  "+languageNames);
	}
	
	
	
	
	
	driver.quit();
	
	
	
	}
	

}

package com.RadioButtonsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;


public class EchoEchoApplication_RadioButtonsTesting extends BaseTest{
	
	
	@Test
	public void group1RadioButtonTesting() {
		
		/*
		 <input type="radio" name="group1" value="Milk">
         <input type="radio" name="group1" value="Butter" checked="">
         <input type="radio" name="group1" value="Cheese">

         <input type="radio" name="group2" value="Water">
         <input type="radio" name="group2" value="Beer">
         <input type="radio" name="group2" value="Wine" checked=""> 
		 
		 */
		
		
		By group1RadioButtonProperty=By.name("group1");
		List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonProperty);
		
		int group1RadioButtons_Count=group1RadioButtons.size();
		System.out.println("The number of Radio Button in Group1 are  "+group1RadioButtons_Count);
		
		 
		
		for(int radioButtonClick=0;radioButtonClick<group1RadioButtons_Count;radioButtonClick++)
		{
		String group1RadioButtonName=group1RadioButtons.get(radioButtonClick).getAttribute("value");
		System.out.println(group1RadioButtonName);

		group1RadioButtons.get(radioButtonClick).click();


		//Thread.sleep(10000);

		// Getting the Status of the Radio Buttons
		for(int radioButtonsStatus=0;radioButtonsStatus<group1RadioButtons_Count;radioButtonsStatus++ )
		{
		System.out.println(group1RadioButtons.get(radioButtonsStatus).getAttribute("value")+" - "+ group1RadioButtons.get(radioButtonsStatus).getAttribute("checked"));
		}
		
		}
		
		
		
		
		
	} 
	
	
	

}

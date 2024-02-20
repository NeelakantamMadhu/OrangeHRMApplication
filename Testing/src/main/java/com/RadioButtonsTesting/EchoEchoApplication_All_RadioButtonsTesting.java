package com.RadioButtonsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EchoEchoApplication_All_RadioButtonsTesting extends BaseTest{
	
	

	@Test
	public void group1and2_RadioButtonTesting() throws InterruptedException {
		
		/*
		 <input type="radio" name="group1" value="Milk">
         <input type="radio" name="group1" value="Butter" checked="">
         <input type="radio" name="group1" value="Cheese">

         <input type="radio" name="group2" value="Water">
         <input type="radio" name="group2" value="Beer">
         <input type="radio" name="group2" value="Wine" checked=""> 
		 
		 
		 /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
		 /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]
		 /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[6]
		 */
		
		
		// By group1RadioButtonProperty=By.name("group1");
		// List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonProperty);
		// int group1RadioButtons_Count=group1RadioButtons.size();
		// System.out.println("The number of Radio Button in Group1 are  "+group1RadioButtons_Count);
		
		
		
		By group1RadioButtonProperty=By.xpath
		("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td");
		WebElement radioButtonWebTable=driver.findElement(group1RadioButtonProperty);
		
		List<WebElement>group1RadioButtons=radioButtonWebTable.findElements(By.tagName("input"));
		int radioButtonName_Count=group1RadioButtons.size();
		System.out.println("The Number of Radio Buttons is - "+radioButtonName_Count);
			
		
		
		
		
		for(int radioButtonClick=1;radioButtonClick<radioButtonName_Count;radioButtonClick++)
		{
			//WebElement rows_Table=rows.get(rowIndex);
			
			WebElement Buttons=group1RadioButtons.get(radioButtonClick);
			
			By groups_RadioButtonProperty=By.xpath
			("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input["+radioButtonClick+"]");
			WebElement groups_RadioButtons=Buttons.findElement(groups_RadioButtonProperty);
			String radioButtonName=groups_RadioButtons.getText();
			//System.out.println("-"+radioButtonName);
			group1RadioButtons.get(radioButtonClick).click();;
			System.out.println("-"+radioButtonName);
		Thread.sleep(10000);

		// Getting the Status of the Radio Buttons
		for(int radioButtons_Names=1; radioButtons_Names<radioButtonName_Count; radioButtons_Names++) {
			
			
			System.out.println(group1RadioButtons.get(radioButtons_Names).getAttribute("value")+" - "+ group1RadioButtons.get(radioButtons_Names).getAttribute("checked"));
			
			
			
			
		}
		
		System.out.println();
		
	} 
	
	

	}}

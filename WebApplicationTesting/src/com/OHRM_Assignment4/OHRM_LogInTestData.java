package com.OHRM_Assignment4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogInTestData {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		

		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
		
		driver.get(applicationUrlAddress);
		
		
		// Validating the WebPage 
		   //Expected Title - OrangeHRM (should be same)
		
		String expected_OrangeHrmLogInPageTitle="OrangeHRM";
		System.out.println("The Expected OrangeHrm logIn Page Title is :- "+expected_OrangeHrmLogInPageTitle);
		
		 // of the current webpage - identifying the Title
		
		String actual_OrangeHrmLogInPageTitle=driver.getTitle();
		System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+actual_OrangeHrmLogInPageTitle);
		
		
		if (actual_OrangeHrmLogInPageTitle.equals(expected_OrangeHrmLogInPageTitle)) 
		{
			System.out.println("The Title of the OrangenHRM logIn page Matched - PASS");
		}
		else {
			System.out.println("The Title of the OrangenHRM logIn page NOT Matched - FAIL");
		}
		
	//	driver.close();
		
		System.out.println();
		
		//**** Expected URL - orangehrm-4.2.0.1 (should have)
		
		String expected_OrangeHrmLogInPageURL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.out.println("The Expected OrangeHrm LogIn page URL is :- "+expected_OrangeHrmLogInPageURL);
		
		 //of the current webpage - identifying the URL
		
		String actual_OrangeHrmLogInPageURL=driver.getCurrentUrl();
		System.out.println("The Actual OrangeHrm LogIn page URL is :- "+actual_OrangeHrmLogInPageURL);
		
		if (actual_OrangeHrmLogInPageURL.equals(expected_OrangeHrmLogInPageURL)) 
		{
			System.out.println("Successfully Navigated to OrangeHrm LogIn Page URL Address Matched - PASS");
		}
		else {
			System.out.println("Failed Navigated to OrangeHrm LogIn Page URL Address NOT Matched - FAIL");
		}
		
		System.out.println("_____________________________________________________________________");
		
		
		
		
		System.out.println("________________________________________________________________________");
		
		//**** Expetced Text - LOGIN Panel (should be same)
		
		
	//	<div id="logInPanelHeading">LOGIN Panel</div>
		
		
		String expected_OrangeHrmLogInPanel="LOGIN Panel";
		System.out.println("The Expected OrangeHrm logIn Page LOGIN Panel is :- "+expected_OrangeHrmLogInPanel);
		
		
		// of the current webpage - identifying the LOGIN Panel
		
				
			
				By OrangeHrmLogInPanelProperty=By.id("logInPanelHeading");
				WebElement OrangeHrmLogInPanel=driver.findElement(OrangeHrmLogInPanelProperty);
				
				String actual_OrangeHrmLogInPanel=OrangeHrmLogInPanel.getText();
				System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+OrangeHrmLogInPanel);
				
			
				if (expected_OrangeHrmLogInPanel.equals(actual_OrangeHrmLogInPanel))
				{
					System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel Matched - PASS");
				}
				else {
					System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
				}
		
		
		
				System.out.println();
				
				Thread.sleep(5000);
				
				
				
				
				//******* LogIn with Validted Test Data
		
		
                //Identify the File in the system
				FileInputStream logInTestDataFile=new FileInputStream("./src/com/OHRMApplicationTestDataFile/OHRM_LogInTestData.xlsx");
		         
				//Identify the WorkBook in the File
				XSSFWorkbook workBook=new XSSFWorkbook(logInTestDataFile);
				
				//Identify the Sheet in the WorkBook
			      XSSFSheet logInTestDataSheet=workBook.getSheet("Nikky");
			      
			   // Create a all row of a in the sheet 
			   Row logInTestDataRow=logInTestDataSheet.getRow(1);
			
			  Cell usernameTestDataCell=logInTestDataRow.getCell(0);
			  String usernameTestData =usernameTestDataCell.getStringCellValue();
			
				
				
				
				
			    //  String usernameTestData="Madhu";    //TestData
			     By userNameProperty=By.id("txtUsername");    //Property of an element is identified and assigned to a variable
				 WebElement userName=driver.findElement(userNameProperty);    //Finding a webElement with the property in the current webpage
				 userName.sendKeys(usernameTestData);
				 
				 
				Cell passwordTestDataCell=logInTestDataRow.getCell(1);
				String passwordTestData=passwordTestDataCell.getStringCellValue();
				 
				 
				 
				// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
				 
				//  String passwordTestData="Livetech@123";
		          By passwordProperty=By.name("txtPassword");		 
				 WebElement password=driver.findElement(passwordProperty);
				 password.sendKeys(passwordTestData);
				 
			//	 <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
				 
				 
				 By logInButtonProperty=By.className("button");
				 WebElement LogInButton=driver.findElement(logInButtonProperty);
				 LogInButton.click();
				 
				 Thread.sleep(5000);
				
		         //******** Validating the HomePage 
		          // Expeced Title - OrangeHRM (should be same)
		
		
				 String expected_OrangeHrmHomePageTitle="OrangeHRM";
				 System.out.println("The Expected OrangeHrm logIn Page Title is :- "+expected_OrangeHrmHomePageTitle);
					
				// of the current webpage - identifying the Title
					
					String actual_OrangeHrmHomePageTitle=driver.getTitle();
					System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+actual_OrangeHrmHomePageTitle);
					
					
					if (actual_OrangeHrmHomePageTitle.equals(expected_OrangeHrmHomePageTitle)) 
					{
						System.out.println("The Title of the OrangenHRM Home page Matched - PASS");
					}
					else {
						System.out.println("The Title of the OrangenHRM Home page NOT Matched - FAIL");
					}
					
					Thread.sleep(5000);
					
			//*********** Expected Text - Welcome (should have)		
					
					
				//	<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
					
					By welcomeAdminProperty=By.linkText("Welcome Admin");
					WebElement welcome=driver.findElement(welcomeAdminProperty);
					
					
					String welcomeHrefAttributeValue=welcome.getAttribute("href");
					System.out.println("The href Attribute value of welcome webElement is :- "+welcomeHrefAttributeValue);
					
					// Performing click on the Welcome WebElement 
				
					
					
					String webpageUrlAddress=driver.getCurrentUrl();
					System.out.println("The webpage URL Address is :- "+webpageUrlAddress);
					
					//if (webpageUrlAddress.contains(welcomeHrefAttributeValue))
					if (welcomeHrefAttributeValue.equalsIgnoreCase(webpageUrlAddress))
					{
						System.out.println("Url is Matched - PASS");
						
						//
						Cell testRowOfCell=logInTestDataRow.createCell(2);
						testRowOfCell.setCellValue("successfuly Navigated to OrangeHRM Application HomePage - PASS");
						
					}
					else {
						System.out.println("Url is NOT Matched - FAIL");
						
						Cell testRowOfCell=logInTestDataRow.createCell(2);
						testRowOfCell.setCellValue("successfuly Navigated to OrangeHRM Application HomePage - PASS");
						
					}
					
					
					FileOutputStream testResultFail=new FileOutputStream("./src/com/OHRMApplicationTestDataFile/OHRMApplicationLogInResult.xlsx");
					workBook.write(testResultFail);
					
					
					
					
					
					welcome.click();
					
					Thread.sleep(5000);
					
					//__________________________or___________________________
					
					System.out.println("____________________or______________");
					
					
			/*		
			//		<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
					 welcomeAdminProperty=By.partialLinkText("Admin");
					WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
					
					String expected_OrangeHrmHomePageWelcomeButton="Welcome";
					System.out.println("The Expected OrangeHrm Homepage Welcome Button is :- "+expected_OrangeHrmHomePageWelcomeButton);
					
			    	String actual_OrangeHrmHomePageWelcomeButton=welcomeAdmin.getText();
					System.out.println("The actual OrangeHrm Homepage Welcome Button is :- "+actual_OrangeHrmHomePageWelcomeButton);
					
					if (actual_OrangeHrmHomePageWelcomeButton.contains(expected_OrangeHrmHomePageWelcomeButton)) 
					{
						System.out.println("The Welcome link of the OrangeHrm Homepage is Matched - PASS");
					}
					else {
						System.out.println("The Welcome link of the OrangeHrm Homepage is NOT Matched - FAIL");
					}
					
					welcomeAdmin.click();
				*/	
					
					
					
					
					
					
					
					
					// Automate logOut
					
				//	Thread.sleep(5000);
					
					
					// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
						
					 
					  
					  By LogoutButtonProperty=By.linkText("Logout");
					  WebElement LogoutButton=driver.findElement(LogoutButtonProperty);
					  LogoutButton.click();
					  
					
					  
					//_____________________________________________________
						
						System.out.println("__________________________________");
						
						
					// Navigate to OrangeHrm Application LogInPage
					
					//Expected Title - OrangeHRM (should be same)
						
						 expected_OrangeHrmLogInPageTitle="OrangeHRM";
						System.out.println("The Expected OrangeHrm logIn Page Title is :- "+expected_OrangeHrmLogInPageTitle);
						
						 // of the current webpage - identifying the Title
						
						 actual_OrangeHrmLogInPageTitle=driver.getTitle();
						System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+actual_OrangeHrmLogInPageTitle);
						
						
						if (actual_OrangeHrmLogInPageTitle.equals(expected_OrangeHrmLogInPageTitle)) 
						{
							System.out.println("The Title of the OrangenHRM logIn page Matched - PASS");
						}
						else {
							System.out.println("The Title of the OrangenHRM logIn page NOT Matched - FAIL");
						}
						
				
						
						System.out.println();
						
						//**** Expected URL - orangehrm-4.2.0.1 (should have)
						
						 expected_OrangeHrmLogInPageURL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
						System.out.println("The Expected OrangeHrm LogIn page URL is :- "+expected_OrangeHrmLogInPageURL);
						
						 //of the current webpage - identifying the URL
						
						 actual_OrangeHrmLogInPageURL=driver.getCurrentUrl();
						System.out.println("The Actual OrangeHrm LogIn page URL is :- "+actual_OrangeHrmLogInPageURL);
						
						if (actual_OrangeHrmLogInPageURL.equals(expected_OrangeHrmLogInPageURL)) 
						{
							System.out.println("Successfully Navigated to OrangeHrm LogIn Page URL Address Matched - PASS");
						}
						else {
							System.out.println("Failed Navigated to OrangeHrm LogIn Page URL Address NOT Matched - FAIL");
						}
						
						System.out.println();
					
					
						System.out.println("________________________________________________________________________");
						
						//**** Expetced Text - LOGIN Panel (should be same)
						
						
					//	<div id="logInPanelHeading">LOGIN Panel</div>
						
						
						 expected_OrangeHrmLogInPanel="LOGIN Panel";
						System.out.println("The Expected OrangeHrm logIn Page LOGIN Panel is :- "+expected_OrangeHrmLogInPanel);
						
						
						// of the current webpage - identifying the LOGIN Panel
						
						
						
						 OrangeHrmLogInPanelProperty=By.id("logInPanelHeading");
						 OrangeHrmLogInPanel=driver.findElement(OrangeHrmLogInPanelProperty);
						
						 actual_OrangeHrmLogInPanel=OrangeHrmLogInPanel.getText();
						System.out.println("The Actual OrangeHrm LogIn Page Title is :- "+OrangeHrmLogInPanel);
						
					
						if (expected_OrangeHrmLogInPanel.equals(actual_OrangeHrmLogInPanel))
						{
							System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel Matched - PASS");
						}
						else {
							System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
						}		
						
						
					driver.quit();
					
			
						
		
		
		
	}

}

package com.Assignment;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class OHrmAutommation_PIM {

	public static void main(String[] args) throws InterruptedException {
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
				
				
				
				
				
				
				//******* LogIn with Validted Test Data
		
		

		/*
		//   <input name="txtUsername" id="txtUsername" type="text">


		< - Tag
		input - TagName

		name - attribute / locator
		txtUsername - corresponding value

		id - attribute / locator
		txtUsername - corresponding value / selector

		type - attribute / its not a locator of WebDriver
		 text -  corresponding value / selector

		*/
		         //   <input name="txtUsername" id="txtUsername" type="text">
		        
			      String usernameTestData="Madhu";    //TestData
			     By userNameProperty=By.id("txtUsername");    //Property of an element is identified and assigned to a variable
				 WebElement userName=driver.findElement(userNameProperty);    //Finding a webElement with the property in the current webpage
				 userName.sendKeys(usernameTestData);
				 
				// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
				 
				  String passwordTestData="Livetech@123";
		          By passwordProperty=By.name("txtPassword");		 
				 WebElement password=driver.findElement(passwordProperty);
				 password.sendKeys(passwordTestData);
				 
			//	 <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
				 
				 
				 By logInButtonProperty=By.className("button");
				 WebElement LogInButton=driver.findElement(logInButtonProperty);
				 LogInButton.click();
				 
				 
				 		
		
		
		
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
					  
		//************Automation  Header link PIM  Button			
					
	            //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
		        //id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		
		        By PIMButtonProperty= By.linkText("PIM");
		        WebElement PIMElement= driver.findElement(PIMButtonProperty);
		        
		        Actions mouseHoverOperation=new Actions(driver);
		        mouseHoverOperation.moveToElement(PIMElement).build().perform();
		
	   //************Automation  Header link Add Employee  Button	
		        
		        //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" 
	        	//id="menu_pim_addEmployee">Add Employee</a>
		
		       By AddEmployeeProperty=By.linkText("Add Employee");
		       WebElement AddEmployee=driver.findElement(AddEmployeeProperty);
		       AddEmployee.click();
		
		       
		     
		       
		       
		       
		//********Enter AddName FristName Automation
		       
		       //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		
		       String FristNameTestData="Madhu";
		       By FristNameProperty= By.className("formInputText");
		       WebElement FristName=driver.findElement(FristNameProperty);
		       FristName.sendKeys(FristNameTestData);
		       
		       
		       
		
	  //********Enter AddName middleName Automation
		       
		       //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		       
		      String middleNameTestData="Sai";
		      By middleNameProperty=By.name("middleName");
		      WebElement middleName=driver.findElement(middleNameProperty);
		      middleName.sendKeys(middleNameTestData);
		
		      
	  //********Enter AddName lastName Automation	      
		      
		      //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		      
		      String lastNameTestData="Chandu";
		      By lastNameProperty= By.id("lastName");
		      WebElement lastName=driver.findElement(lastNameProperty);
		      lastName.sendKeys(lastNameTestData);
		      
		      
		   
		   
     //********Enter AddName EmployeeId Automation      
		      
		      //<input class="formInputText valid" maxlength="10" type="text" 
		      //name="employeeId" value="0001" id="employeeId">
		      
		     By employeeIdProperty=By.id("employeeId");
		     WebElement employeeId=driver.findElement(employeeIdProperty);
		     String Id=employeeId.getAttribute("value");
		      
		     System.out.println("the EmployId number is :-  "+Id);
		      
	  //*************  Automation Save Button
		      
		      //<input type="button" class="" id="btnSave" value="Save">
		      
		      
		     By saveProperty= By.id("btnSave");
		     WebElement  save= driver.findElement(saveProperty);
		     save.click(); 
		      
		     
//--------------->>>>>>>>>>>>>>>>>>>>      Ater saveing FirstName
		     
		     //<input value="Madhu" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" 
		     //title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
			  
		   By afterSaveFirstNamePropertty= By.id("personal_txtEmpFirstName");
		   WebElement afterSaveFirstName = driver.findElement(afterSaveFirstNamePropertty);
		   String Actual_FirstName=afterSaveFirstName.getAttribute("value");
		     
 //--------------->>>>>>>>>>>>>>>>>>>>      Ater saveing MiddleName		
		   
		    //<input value="Sai" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" 
		    //title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled"> 
		      
		   By afterSaveMiddleNameProperty= By.id("personal_txtEmpMiddleName");
		   WebElement  afterSaveMiddleName= driver.findElement(afterSaveMiddleNameProperty); 
		   String Actual_MiddleName=afterSaveMiddleName.getAttribute("value");  
		     
 //--------------->>>>>>>>>>>>>>>>>>>>      Ater saveing LastName
		   
		   //<input value="Chandu" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" 
		   //title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
		     
		   By afterSaveLastNameProperty=By.id("personal_txtEmpLastName");
		   WebElement afterSaveLastName=driver.findElement(afterSaveLastNameProperty);
		   String Actual_LastName=afterSaveLastName.getAttribute("value");
		   
//--------------->>>>>>>>>>>>>>>>>>>>      Ater saveing EmployeeId
		   
		   //<input value="0021" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" 
		   //id="personal_txtEmployeeId" disabled="disabled">
		   
		   By afterSaveEmployeeIdPrperty=By.id("personal_txtEmployeeId");
		   WebElement afterSaveEmployeeId=driver.findElement(afterSaveEmployeeIdPrperty);
		   String Actual_EmployeeId= afterSaveEmployeeId.getAttribute("value");
		   
//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  FristName		   
		   
		   if(Actual_FirstName.equals("Madhu")) {
			   System.out.println("After saving the both are same :-  PASS");
		   }
		   else {
			   System.out.println("After saving the both are NOT same :- FAIL ");
		   }
		   
		   
//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  MiddleName  

		   if(Actual_MiddleName.equals("Sai")) {
			   System.out.println("After saving the both are same :-  PASS");
		   }
		   else {
			   System.out.println("After saving the both are NOT same :- FAIL ");
		   }
		   
//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  LastName		   
		   
		   if(Actual_LastName.equals("Chandu")) {
			   System.out.println("After saving the both are same :-  PASS");
		   }
		   else {
			   System.out.println("After saving the both are NOT same :- FAIL ");
		   }
		   
//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  EmployeeId
		   
		   
		   if(Actual_EmployeeId.equals(Id)) {
			   System.out.println("After saving the both are same :-  PASS");
		   }
		   else {
			   System.out.println("After saving the both are NOT same :- FAIL ");
		   }
		   
		   
		   
		  
	 //*************  Automation  Welcome Admin Button
		     
		      //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		      
		     By welcomeProperty=By.linkText("Welcome Admin");
		     WebElement welcome=driver.findElement(welcomeProperty); 
		     welcome.click();
		      
		      Thread.sleep(5000);
		      
     //*************  Automation  Welcome Admin Button   
		      
		      //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		      
		     By logOutProperty= By.linkText("Logout");
		     WebElement logOut=driver.findElement(logOutProperty);
		     logOut.click(); 
		      
		   
		      
		      
		     driver.quit();     
		      
	}

}

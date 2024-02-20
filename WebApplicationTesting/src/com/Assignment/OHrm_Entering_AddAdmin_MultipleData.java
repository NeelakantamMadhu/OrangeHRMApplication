package com.Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OHrm_Entering_AddAdmin_MultipleData {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
        WebDriver driver;
		
		String apllicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(apllicationUrlAddress);
		
		FileInputStream file=new FileInputStream("./src/com/Excel/AddEmployeeMultipleData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet Sheet=workbook.getSheet("Sheet1");
		
		int row_count=Sheet.getLastRowNum();
		
		System.out.println("The number of row in the Sheet is :-  "+row_count);
		
		int rowOfCells_Count=Sheet.getLeftCol();
		
		System.out.println("The number of roeOfCells in the sheet is :-  "+rowOfCells_Count);
		
//===================================================================================================================================================					
		
		
			//<div id="logInPanelHeading">LOGIN Panel</div>
			
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
						Sheet.getRow(1).createCell(1).setCellValue(actual_OrangeHrmLogInPanel);
						Sheet.getRow(1).createCell(2).setCellValue("PASS");
					}
					else {
						System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
						Sheet.getRow(1).createCell(1).setCellValue("NOT Match  - "+actual_OrangeHrmLogInPanel);
						Sheet.getRow(1).createCell(2).setCellValue("FAIL");
					}
					
//===================================================================================================================================================					
					
					//Expect Title is - OrangeHRM  (should be same)
					
					String Expected_orangeHrmLogInPage="OrangeHRM";
					System.out.println("The OrangeHRM logIn Page title is :-  "+Expected_orangeHrmLogInPage);
					
					
					String Actual_orangenHrmLogInPageText=driver.getTitle();
					System.out.println("The OrangenHrm LogIn Page Title is :-  "+Actual_orangenHrmLogInPageText);
					
					
					if(Actual_orangenHrmLogInPageText.equals(Expected_orangeHrmLogInPage))
					{
						System.out.println("The LogIn Page Title is Match :- PASS");
						Sheet.getRow(1).createCell(4).setCellValue(Actual_orangenHrmLogInPageText);
						Sheet.getRow(1).createCell(5).setCellValue("PASS");
					}
					else {
						System.out.println("The LogIn Page Title is NOT Match :- FAIL");
						Sheet.getRow(1).createCell(4).setCellValue("NOT Match - "+Actual_orangenHrmLogInPageText);
						Sheet.getRow(1).createCell(5).setCellValue("FAIL");
					}
					
					
//===================================================================================================================================================					
						
					
					// UserName - Test Data
					
					XSSFRow row=Sheet.getRow(1);
					
					String userName_TestData=row.getCell(6).getStringCellValue();
					
					//<input name="txtUsername" id="txtUsername" type="text">
					By userNameProperty=By.id("txtUsername");
					WebElement userName=driver.findElement(userNameProperty);
					userName.sendKeys(userName_TestData);
					
					//UserName Password  -  Test Data
					
					String password_TestData=row.getCell(7).getStringCellValue();
					
					//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
					By passwordProperty=By.name("txtPassword");
					WebElement password=driver.findElement(passwordProperty);
					password.sendKeys(password_TestData);
					
					
					// Click on LogIn Button
					
					//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
					By logInProperty=By.className("button");
					WebElement logIn=driver.findElement(logInProperty);
					logIn.click();
					
					
//===================================================================================================================================================					
										
					
			  //   *********** Expected Text - Welcome (should have)		
								
			 // ---->>>>>>>>>>>>>> Performing click on the Welcome WebElement 	
				          			
				          			
					//	<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
												
					String Expect_WebpageText= "Admin";
					System.out.println("The Expected OrangeHrm Home page text is Welcome  :-  "+Expect_WebpageText);
									 
									 
					By welcomeAdminProperty=By.linkText("Welcome Admin");
					WebElement welcome=driver.findElement(welcomeAdminProperty);
												
												
					//String actual_welcomeHrefAttributeValue=welcome.getAttribute("id");
									
									             //OR
									
					String actual_welcomeHrefAttributeValue=welcome.getText();
					System.out.println("The href Attribute value of welcome webElement is :- "+actual_welcomeHrefAttributeValue);
									
									
					//if(actual_welcomeHrefAttributeValue.equals(Expect_WebpageText))
									
								                  //OR
									
					if(actual_welcomeHrefAttributeValue.contains(Expect_WebpageText))	
					{
						System.out.println("The text is Match :- PASS");				
						Sheet.getRow(1).createCell(9).setCellValue(actual_welcomeHrefAttributeValue);
						Sheet.getRow(1).createCell(10).setCellValue("PASS ");
					}
					else {
						System.out.println("The text is NOT Match :-  FAIL");
						Sheet.getRow(1).createCell(9).setCellValue("Not Match the title Welcome");
						Sheet.getRow(1).createCell(10).setCellValue("Not Match the webpage FAIL");
					}
						
									
					
//===================================================================================================================================================					
										
					
					  
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
					
					
					
//===================================================================================================================================================					
				
					
					
			//   *********** Expected AddEmployeeText - Full Name (should be same)	
					
					String Expect_AddAdminText="Full Name";
					System.out.println("The Expect OrangeHrm AddAdmin page Text is :-  " +Expect_AddAdminText);
					
					//<label class="hasTopFieldHelp">Full Name</label>
					By fullNameProperty=By.className("hasTopFieldHelp");
					WebElement fullName=driver.findElement(fullNameProperty);
					
					String Actual_AddEmployeeText=fullName.getText();
					System.out.println("The Actual OrangeHrm AddAdmin Page text is :-  "+Actual_AddEmployeeText);
					
					if(Actual_AddEmployeeText.equals(Expect_AddAdminText)) 
					{
						System.out.println("The Add Employee Page Text is Match ;-  PASS");
						Sheet.getRow(1).createCell(12).setCellValue(Actual_AddEmployeeText);
						Sheet.getRow(1).createCell(13).setCellValue("PASS");
					}
					else {
						System.out.println("The Add Employee Page Text is NOT Match :-  FAIL");
						Sheet.getRow(1).createCell(12).setCellValue("NOT Match Text - "+Actual_AddEmployeeText);
						Sheet.getRow(1).createCell(13).setCellValue("FAIL");
					}
					
					
					
//===================================================================================================================================================					
					String addEmployeeUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee";
					
					for(int indexrow=1; indexrow<=Sheet.getLastRowNum(); indexrow++) {
						
						
						
						XSSFRow row_AddAdmin=Sheet.getRow(indexrow);
					
					// --->>>>> This Names is Expected TestData in the Excel Sheet
					
            // FirstName - Test Data
					
					String firstName_TestData=row_AddAdmin.getCell(14).getStringCellValue();
					
					//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
					By firstNameProperty=By.id("firstName");
					WebElement firstName=driver.findElement(firstNameProperty);
					firstName.sendKeys(firstName_TestData);
					
			// MiddleName - Test Data	
					String middleName_TestData=row_AddAdmin.getCell(15).getStringCellValue();
					
					//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
					By middleNameProperty=By.id("middleName");
					WebElement middleName=driver.findElement(middleNameProperty);
					middleName.sendKeys(middleName_TestData);
					
			// LastName - Test Data	
					
				    String lastName_TestData=row_AddAdmin.getCell(16).getStringCellValue();
					
					//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
					By lastNameProperty=By.id("lastName");
					WebElement lastName=driver.findElement(lastNameProperty);
					lastName.sendKeys(lastName_TestData);
					
					   
					   
		   //********Enter AddName EmployeeId Automation      
						
					
				
					//<input class="formInputText valid" maxlength="10" type="text" 
					//name="employeeId" value="0001" id="employeeId">
						      
				    By employeeIdProperty=By.id("employeeId");
					WebElement employeeId=driver.findElement(employeeIdProperty);
					String Id=employeeId.getAttribute("value");
						      
					System.out.println("the EmployId number is :-  "+Id);
						      		
					Sheet.getRow(indexrow).createCell(17).setCellValue(Id);
					
					
		  //*************  Automation Save Button
				      
				     //<input type="button" class="" id="btnSave" value="Save">
				     
				     By saveProperty= By.id("btnSave");
				     WebElement  save= driver.findElement(saveProperty);
				     save.click(); 
				      	
					
//===================================================================================================================================================					
											
				     
					
				//   *********** Expected Personal Details Text After Click on Save - Full Name (should be same)	
						
						String Expect_PersonalDetailsPageText="Full Name";
						System.out.println("The Expect OrangeHrm AddAdmin page Text is :-  " +Expect_PersonalDetailsPageText);
						
						
						//<label for="Full_Name" class="hasTopFieldHelp">Full Name</label>
						By PersonalDetailsPage_FullNameProperty=By.className("hasTopFieldHelp");
						WebElement PersonalDetailsPage_FullName=driver.findElement(PersonalDetailsPage_FullNameProperty);
						
						String Actual_PersonalDetailsPageText=PersonalDetailsPage_FullName.getText();
						System.out.println("The Actual OrangeHrm AddAdmin Page text is :-  "+Actual_PersonalDetailsPageText);
						
						if(Actual_PersonalDetailsPageText.equals(Expect_PersonalDetailsPageText)) 
						{
							System.out.println("The Add Employee Page Text is Match ;-  PASS");
							Sheet.getRow(indexrow).createCell(19).setCellValue(Actual_AddEmployeeText);
							Sheet.getRow(indexrow).createCell(20).setCellValue("PASS");
						}
						else {
							System.out.println("The Add Employee Page Text is NOT Match :-  FAIL");
							Sheet.getRow(indexrow).createCell(19).setCellValue("NOT Match Text - "+Actual_AddEmployeeText);
							Sheet.getRow(indexrow).createCell(20).setCellValue("FAIL");
						}
								
					
					System.out.println();
//===================================================================================================================================================					
					
					
			// --->>>>> This Names is Actual TestData in the Add Employee Page
					
					     
			//--------------->>>>>>>>>>>>>>>>>>>>      After saving FirstName
						
						
								     
						//<input value="Madhu" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" 
						//title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
									  
						By afterSaveFirstNameProperty= By.id("personal_txtEmpFirstName");
						WebElement afterSaveFirstName = driver.findElement(afterSaveFirstNameProperty);
						String Actual_FirstName=afterSaveFirstName.getAttribute("value");
								     
			//--------------->>>>>>>>>>>>>>>>>>>>      After saving MiddleName		
								   
						//<input value="Sai" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" 
						//title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled"> 
								      
						By afterSaveMiddleNameProperty= By.id("personal_txtEmpMiddleName");
						WebElement  afterSaveMiddleName= driver.findElement(afterSaveMiddleNameProperty); 
						String Actual_MiddleName=afterSaveMiddleName.getAttribute("value");  
								     
			//--------------->>>>>>>>>>>>>>>>>>>>      After saving LastName
								   
						//<input value="Chandu" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" 
						//title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
								     
						By afterSaveLastNameProperty=By.id("personal_txtEmpLastName");
						WebElement afterSaveLastName=driver.findElement(afterSaveLastNameProperty);
						String Actual_LastName=afterSaveLastName.getAttribute("value");
								   
			//--------------->>>>>>>>>>>>>>>>>>>>      After saving EmployeeId
								   
						//<input value="0021" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" 
						//id="personal_txtEmployeeId" disabled="disabled">
								   
					    By afterSaveEmployeeIdPrperty=By.id("personal_txtEmployeeId");
					    WebElement afterSaveEmployeeId=driver.findElement(afterSaveEmployeeIdPrperty);
						String Actual_EmployeeId= afterSaveEmployeeId.getAttribute("value");
								   
			//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  FristName		   
								   
						if(Actual_FirstName.equals("Madhu")) 
						{
					       System.out.println("After saving the FirstName are same :-  PASS");
					       Sheet.getRow(indexrow).createCell(21).setCellValue(Actual_FirstName);
					       Sheet.getRow(indexrow).createCell(22).setCellValue("PASS");
						}
						else
						{
							System.out.println("After saving the FirstName are NOT same :- FAIL ");
							Sheet.getRow(indexrow).createCell(21).setCellValue("NOT Match - "+Actual_FirstName);
						    Sheet.getRow(indexrow).createCell(22).setCellValue("FAIL");
						}
								   
								   
			//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  MiddleName  

						if(Actual_MiddleName.equals("Sai")) 
						{
							System.out.println("After saving the MiddleName are same :-  PASS");
							Sheet.getRow(indexrow).createCell(23).setCellValue(Actual_MiddleName);
						    Sheet.getRow(indexrow).createCell(24).setCellValue("PASS");
						}
						else 
						{
							System.out.println("After saving the MiddleName are NOT same :- FAIL ");
							Sheet.getRow(indexrow).createCell(23).setCellValue("NOT Match - "+Actual_MiddleName);
						    Sheet.getRow(indexrow).createCell(24).setCellValue("FAIL");
						}
								   
			//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  LastName		   
								   
						if(Actual_LastName.equals("Chandu")) 
						{
							System.out.println("After saving the LastName are same :-  PASS");
							Sheet.getRow(indexrow).createCell(25).setCellValue(Actual_LastName);
						    Sheet.getRow(indexrow).createCell(26).setCellValue("PASS");
						}
						else 
						{
							System.out.println("After saving the LastName are NOT same :- FAIL ");
							Sheet.getRow(indexrow).createCell(25).setCellValue("NOT Match - "+Actual_LastName);
						    Sheet.getRow(indexrow).createCell(26).setCellValue("FAIL");
						}
								   
			//----------->>>>>>>>>>>>>>>>   Comparing Actual & Expected  EmployeeId
								   
								   
						if(Actual_EmployeeId.equals(Id)) 
						{
							System.out.println("After saving the EmployeeId are same :-  PASS");
							Sheet.getRow(indexrow).createCell(27).setCellValue(Actual_EmployeeId);
						    Sheet.getRow(indexrow).createCell(28).setCellValue("PASS");
						    
						    
						}
						else 
						{
							System.out.println("After saving the EmployeeId are NOT same :- FAIL ");
							Sheet.getRow(indexrow).createCell(27).setCellValue("NOT Match - "+Actual_EmployeeId);
						    Sheet.getRow(indexrow).createCell(28).setCellValue("FAIL");
							
						}
						 
				
//...............................................................................................			
						
						

						  
		//*************  Automation  Welcome Admin Button
										     
				//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
										      

				welcomeAdminProperty=By.linkText("Welcome Admin");
				welcome=driver.findElement(welcomeAdminProperty);
																
				welcome.click();
										      
				Thread.sleep(5000);
										      
		//*************  Automation  Welcome Admin Button   
										      
				//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
										      
				By logOutProperty= By.linkText("Logout");
				WebElement logOut=driver.findElement(logOutProperty);
				logOut.click(); 
										      
								
								
//===================================================================================================================================================					
									

		//Expected Text - LOGIN Panel (should be same)
									
				//<div id="logInPanelHeading">LOGIN Panel</div>
									
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
					Sheet.getRow(indexrow).createCell(30).setCellValue(actual_OrangeHrmLogInPanel);
					Sheet.getRow(indexrow).createCell(31).setCellValue("PASS");
				}
				else {
					System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
					Sheet.getRow(indexrow).createCell(30).setCellValue("NOT Match  - "+actual_OrangeHrmLogInPanel);
					Sheet.getRow(indexrow).createCell(31).setCellValue("FAIL");
				}
								
								
									
						
						
						

				FileOutputStream Madhu=new FileOutputStream("./src/com/Excel/AddEmployeeMultipleData.xlsx");
		                  
		        workbook.write(Madhu);
				
				System.out.println();
						
	
				driver.get(addEmployeeUrlAddress);
						
						
						
						
						
		// UserName - Test Data
						
				row=Sheet.getRow(1);
						
				userName_TestData=row.getCell(6).getStringCellValue();
						
				//<input name="txtUsername" id="txtUsername" type="text">
			    userNameProperty=By.id("txtUsername");
				userName=driver.findElement(userNameProperty);
				userName.sendKeys(userName_TestData);
						
				//UserName Password  -  Test Data
						
				password_TestData=row.getCell(7).getStringCellValue();
						
				//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
				passwordProperty=By.name("txtPassword");
				password=driver.findElement(passwordProperty);
				password.sendKeys(password_TestData);
						
						
	// Click on LogIn Button
						
				//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
				logInProperty=By.className("button");
				logIn=driver.findElement(logInProperty);
				logIn.click();
						
									
						
						
				}		
						
					driver.quit();	
						
						
						
						
						
//===================================================================================================================================================					
						
				/*	
					
						  
			//*************  Automation  Welcome Admin Button
							     
						//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
							      

						welcomeAdminProperty=By.linkText("Welcome Admin");
						welcome=driver.findElement(welcomeAdminProperty);
													
						welcome.click();
							      
						Thread.sleep(5000);
							      
			//*************  Automation  Welcome Admin Button   
							      
						//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
							      
						By logOutProperty= By.linkText("Logout");
						WebElement logOut=driver.findElement(logOutProperty);
						logOut.click(); 
							      
					
					
//===================================================================================================================================================					
						

						//Expected Text - LOGIN Panel (should be same)
						
						//<div id="logInPanelHeading">LOGIN Panel</div>
						
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
									Sheet.getRow(1).createCell(30).setCellValue(actual_OrangeHrmLogInPanel);
									Sheet.getRow(1).createCell(31).setCellValue("PASS");
								}
								else {
									System.out.println("The Title of the OrangenHRM logIn page LOGIN Panel NOT Matched - FAIL");
									Sheet.getRow(1).createCell(30).setCellValue("NOT Match  - "+actual_OrangeHrmLogInPanel);
									Sheet.getRow(1).createCell(31).setCellValue("FAIL");
								}
					
					
						
					
					
			
					FileOutputStream Madhu=new FileOutputStream("./src/com/Excel/AddEmployeeMultipleData.xlsx");
	                  
	                  workbook.write(Madhu);
			
					System.out.println();
					
					
			//driver.get(addEmployeeUrlAddress);
			
					*/
			
		
	
		
		

		
		
}}



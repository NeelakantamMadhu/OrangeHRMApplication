package com.Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OHRM_EmployeeList_ExportToExcel extends Base_Test{
	
	
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		
		@Test(priority = 1)
		public void lunch_OHRM_Application() {
			
			driver.get(applicationUrlAddress);
			
			driver.manage().window().maximize();
			
		}
		
		
		@Test(priority = 2)
		public void Enter_Valid_Data() throws InterruptedException {
			
			// <input name="txtUsername" id="txtUsername" type="text">
			String userNameTestData="Madhu";
			By userNameProperty=By.id("txtUsername");
		    WebElement  userName= driver.findElement(userNameProperty);
			userName.sendKeys(userNameTestData);
			
			// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
			String passwordTestData="Livetech@123";
			By passwordProperty=By.id("txtPassword");
			WebElement password=driver.findElement(passwordProperty);
			password.sendKeys(passwordTestData);
			
			Thread.sleep(3000);
			
			// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			By logInProperty=By.id("btnLogin");
			WebElement logIn=driver.findElement(logInProperty);
			logIn.click();
			
			Thread.sleep(3000);
		}
		
	
		@Test(priority = 3)
		public void OHRM_HomePage() throws InterruptedException, IOException {
			
			
			//************Automation  Header link PIM  Button			
			
	        //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
	        //id="menu_pim_viewPie2d3dmModule" class="firstLevelMenu"><b>PIM</b></a>

	        By PIMButtonProperty= By.linkText("PIM");
	        WebElement PIMElement= driver.findElement(PIMButtonProperty);
	        
	        Actions mouseHoverOperation=new Actions(driver);
	        mouseHoverOperation.moveToElement(PIMElement).build().perform();

			// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>
			By employeeListProperty=By.linkText("Employee List");
			WebElement employeeList=driver.findElement(employeeListProperty);
			employeeList.click();
			
			
			
			// /html/body/div[1]/div[3]/div[2]/div/form/div[4]
			By employees_webTableProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]");
			WebElement employees_webTable=driver.findElement(employees_webTableProperty);
			
			Thread.sleep(3000);
		
			// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[1]/input
			// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[50]/td[8]
			
			
			List<WebElement>rows=employees_webTable.findElements(By.tagName("tr"));
			int rows_Count=rows.size();
			System.out.println("The count of rows is :-  "+rows_Count);
			
			  
            FileInputStream testDataFile = new FileInputStream("./src/com/Excel/OHRM_EmployeeList_Data_ExportToExcel.xlsx");
        	XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
        	XSSFSheet testDataSheet = workBook.getSheet("Sheet1");


			
			
			for(int rowIndex=1; rowIndex<rows_Count; rowIndex++ )
			{
				Row newRow=testDataSheet.createRow(rowIndex);
				WebElement rows_Table=rows.get(rowIndex);
				
				// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[50]/td[8]
				List<WebElement>webTable_RowOfCell=rows_Table.findElements(By.tagName("td"));
				int rowOfCell_Value=webTable_RowOfCell.size();
				
	            System.out.println("The Employee RowOfCell Value is :-  "+rowOfCell_Value);
	          
				
				for(int cellIndex=1; cellIndex<webTable_RowOfCell.size(); cellIndex++) 
				{
					
					Cell newRowOfCell=newRow.createCell(cellIndex);
					
					By employee_data_property =By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr["+rowIndex+"]/td["+cellIndex+"]");
					                           //      ("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr["+rowIndex+"]/td["+cellIndex+"]/input");
					WebElement employee_data=driver.findElement(employee_data_property);
			
				
					String rowOfCell_Text=employee_data.getText();
					
					System.out.print("The Add Admin Employee List is :-  "+rowOfCell_Text+"  //   ");
					
					newRowOfCell.setCellValue(rowOfCell_Text);
					
					FileOutputStream testOutPutFile = new FileOutputStream("./src/com/Excel/OHRM_EmployeeList_Data_ExportToExcel.xlsx");
	 				workBook.write(testOutPutFile);
	 				
	 				
					
				}
				System.out.println("  /  ");
				
			}
				
			
		}
	
		
		

		@Test(priority = 4)
		public void logOut_WebPage() throws InterruptedException {
			
			
			
			  
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
				      
				     Thread.sleep(5000);
			
			
			driver.close();
			
			
		}
		

}

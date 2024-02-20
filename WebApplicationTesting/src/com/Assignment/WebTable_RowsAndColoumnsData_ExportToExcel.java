package com.Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class WebTable_RowsAndColoumnsData_ExportToExcel extends Base_Test {
	
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	
	
	@Test(priority = 1)
	public void setUp_OHrmUrl() {
		
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
	}
	
	
	
	@Test(priority = 2)
	public void excel_ExportRowsAndColumnsData() throws IOException
	{

	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[3]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]

		
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table
		
		
	

		By wabTableProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table");
		WebElement wabTable=driver.findElement(wabTableProperty);
		
		List<WebElement>rows=wabTable.findElements(By.tagName("tr"));
		
	FileInputStream testDataFile = new FileInputStream("./src/com/Excel/WebTable_RowsAndColoumnsData.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
	XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

	for(int rowIndex=1;rowIndex<rows.size();rowIndex++)
	{
	Row newRow=testDataSheet.createRow(rowIndex);
	
		
		WebElement row=rows.get(rowIndex);
		List<WebElement>webTableRowOfCells=row.findElements(By.tagName("td"));
		int webTableRowOfCells_Count=webTableRowOfCells.size();
		System.out.println("the no of rowofcells is :- "+webTableRowOfCells_Count);
	 	
	 	 for(int cellIndex=1; cellIndex<=webTableRowOfCells_Count; cellIndex++) {
	 		 
	 		Cell newRowOfCell=newRow.createCell(cellIndex);
	 		 
	 		By webTableCityNameProperty=By.xpath
	 				("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+cellIndex+"]");
	 				WebElement cityName=driver.findElement(webTableCityNameProperty);
	 				String cityName_Text=cityName.getText();
	 				System.out.print(" The CityName is :- "+cityName_Text);

	 				newRowOfCell.setCellValue(cityName_Text);

	 				FileOutputStream testOutPutFile = new FileOutputStream("./src/com/Excel/WebTable_RowsAndColoumnsData.xlsx");
	 				workBook.write(testOutPutFile);
	 				
	 				
	 	 }
	System.out.println("  /  ");
	
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}}

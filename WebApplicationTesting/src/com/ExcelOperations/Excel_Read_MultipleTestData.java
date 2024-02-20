package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//Identify the File in the system
		FileInputStream testDataFile=new FileInputStream("./src/com/Excel/ExcelTestData.xlsx");
		
		//Identify the workBook in the File
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		
		//identify the sheet in the workBook
		XSSFSheet testDataSheet=workBook.getSheet("Sheet2");
		
		// ---->  Identify the Number of Actual Rows with the Test Data in the Sheet 
		int row_Count=testDataSheet.getLastRowNum();
		
		
		//To go to all the Active Rows in the sheet
		for(int rowIndex=0;  rowIndex<row_Count;  rowIndex++) 
		{
			
		   // Going to an Active Row in the Sheet
			Row testDataSheetRow=testDataSheet.getRow(rowIndex);
			
			// --->  Going to an Active Row and finding the number of Active Row of its Cell
			int testDataRowOfCell_Count=testDataSheetRow.getLastCellNum();
			
			
			//To goto every Row of its Respective RowOfCells
			for(int rowOfCellIndex=0; rowOfCellIndex<testDataRowOfCell_Count;  rowOfCellIndex++) 
			{
				//Going to an Active row of cell
				Cell rowOfCell=testDataSheetRow.getCell(rowOfCellIndex);
				
				//Get the Row of a cell value
				String testData=rowOfCell.getStringCellValue();
				
				System.out.print(testData +"   ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

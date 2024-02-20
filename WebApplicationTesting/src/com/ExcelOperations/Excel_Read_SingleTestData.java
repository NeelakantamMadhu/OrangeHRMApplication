package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	

	
	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub

	   
		// Identify the file in the System
		FileInputStream file= new FileInputStream("./src/com/Excel/ExcelTestData.xlsx");

		// Identify the workBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(file);

		 // Identify the Sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		// Identify a Particular Row in the Sheet
		Row testDataSheetRow=testDataSheet.getRow(0);

		// Identify a Particular Row of a Cell in the Row
		Cell testDataRowOfCell=testDataSheetRow.getCell(0);

		// Get the Test data from the Row Of Cell
		String testData=((org.apache.poi.ss.usermodel.Cell) testDataRowOfCell).getStringCellValue();

		System.out.println(testData);
		
		
		
		
		
		
		
		/*
		     	    //Identify the file in the System
		FileInputStream testDataFile = new FileInputStream("./src/com/ExcelTestDataFiles/ExcelTestData.xlsx");
		                                                   ///src/com/ExcelTestDataFiles/ExcelTestData.xlsx     
		//Identify the workBook in the File		
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		
		//Identify the Sheet in the WorkBook
		XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
		
		//Identify a Particular Row in the Sheet
		Row testDataSheetRow=testDataSheet.getRow(0);
		
		//Identify a particular RorOfCell in the Sheet
		Cell testDataSheetRowOfCell=testDataSheetRow.getCell(0);
		
		//Get the Test data form the Row of cell
		String testData=testDataSheetRowOfCell.getStringCellValue();
		
		
		System.out.println(testData);
		 
		*/ 
		
		
		
		
		
		
		
		
		
		
		
	}

}

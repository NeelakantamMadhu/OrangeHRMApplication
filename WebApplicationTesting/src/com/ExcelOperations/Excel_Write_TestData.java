package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_TestData {
public static void main(String[] args) throws IOException {
	

	//Identify the file in the system
	FileInputStream testDataFile=new FileInputStream("./src/com/Excel/ExcelTestData.xlsx");
	
	//Identify the WorkBook in the File
	XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
	
	//Identify the Sheet in the WorkBook
	XSSFSheet testDataSheeet=workBook.getSheet("Sheet1");
	
	//Create a Particular Row in the Sheet
	Row newRow=testDataSheeet.createRow(4);
			
	//Create a Particular RowOfCell in the Row
	Cell newRowOfCell=newRow.createCell(5);
	
	//Sending the TestData into the new Row of cell Create
	newRowOfCell.setCellValue("King and Queen");
	
	
	//The Excel File Along with the WorkBook should be saved
	FileOutputStream testDataResultFile=new FileOutputStream("./src/com/Excel/ExcelTestData.xlsx");
	workBook.write(testDataResultFile);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}

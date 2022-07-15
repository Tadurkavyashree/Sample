package com.project;

import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		//open file in read mode
	FileInputStream fis=new FileInputStream("C:\\exceldata\\readdata.xls");
	//take control of that file
	HSSFWorkbook wb=new HSSFWorkbook(fis);
	//go to that particular sheet
	HSSFSheet sh=wb.getSheet("Sheet1");
	//go to the particular row
	Row r=sh.getRow(2);
	//go to the particular cell
	Cell c= r.getCell(1);
	//capture the string value present inside it
	String xlval=c.getStringCellValue();
	//print the string value
	System.out.println(xlval);
	

	}

}

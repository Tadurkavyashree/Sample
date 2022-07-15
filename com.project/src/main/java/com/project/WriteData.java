package com.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class WriteData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\exceldata\\readdata.xls");
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sh= wb.getSheet("Sheet1");
		HSSFRow r =sh.getRow(1);
		HSSFRow row2 =sh.getRow(2);
		HSSFCell c =  sh.getRow(1).createCell(3);
        row2.createCell(0).setCellValue("Diana");

		c.setCellValue("tina");
		FileOutputStream fos = new FileOutputStream("C:\\exceldata\\readdata.xls");
		wb.write(fos);
		System.out.println("completed");
		
		

	}

}

package com.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.excel.CTClientData.Factory;

public class ReadMultipleData {

	public static void main(String[] args) throws Exception {
		
		int rowcount = 0;
		// TODO Auto-generated method stub
		for(int i = 0;i<rowcount+1;i++)
		{
			Row row = null;
			for(int j=0;j<row.getLastCellNum();j++)
			{
		FileInputStream fis = new FileInputStream("C:\\exceldata\\ReadData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println(wb.getSheet("Projets").getRow(i).getCell(j).getStringCellValue());
		}
		}
	}

}

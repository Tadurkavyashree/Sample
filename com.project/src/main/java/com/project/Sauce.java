package com.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FL_LPT-510\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
        FileInputStream fis = new FileInputStream("C:\\Assessmentselinium\\Data.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("login");
        XSSFRow row = sheet.getRow(1);
        XSSFCell cell = row.getCell(0);
        String str = cell.getStringCellValue();
        System.out.println(str);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
         driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(str);
         sheet = wb.getSheet("login");
          row = sheet.getRow(1);
            cell = row.getCell(1);
            String str1 = cell.getStringCellValue();
            System.out.println(str1);
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(str1);
            driver.findElement(By.xpath("//input[@id='login-button']")).click();
            
              String X=driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText(); System.out.println(X); 
              row=sheet.getRow(1); 
              cell=row.getCell(2);
              
              cell.setCellValue(X); 
              FileOutputStream fos=new FileOutputStream("C:\\Assessmentselinium\\Data.xlsx");
              wb.write(fos);
		
		
		

	}

}

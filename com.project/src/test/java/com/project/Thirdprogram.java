package com.project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Thirdprogram {
	WebDriver driver;
    File file;
    FileOutputStream fo;
    FileInputStream fi;
    Actions act;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
  @Test
  public void f() throws Throwable {
	  wb = new XSSFWorkbook(fi);
      XSSFSheet sheet = wb.getSheetAt(0);
      driver.findElement(By.id("user-name")).sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());
      driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
      driver.findElement(By.id("login-button")).click();
      String data2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
      System.out.println(data2);
      row = sheet.getRow(2);
      row.createCell(1).setCellValue(data2);
      
  }
	  
  
  @BeforeTest
  public void beforeTest() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\FL_LPT-510\\Downloads\\chromedriver_win32//chromedriver.exe");
      driver = new ChromeDriver();
      act = new Actions(driver);
      driver.manage().window().maximize();
      driver.get("https://www.saucedemo.com/");
      
      file = new File(System.getProperty("user.dir")+"\\TestData\\SeleniumData (1).xlsx");
      fi = new FileInputStream(file);
      
      
  }

  @AfterTest
  public void afterTest() throws Throwable {
	  wb.write(fo);
      wb.close();
      fi.close();
      
  }

}

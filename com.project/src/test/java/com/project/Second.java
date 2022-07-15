package com.project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Second {
	 WebDriver driver;
	    WebDriverWait wait;
  @Test
  public void f() {
//	  WebElement element =  driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr/td[text()='1']/parent::tr/th"));
//	     String str = element.getText();
//	     System.out.println(str);
	  }
  
  @BeforeTest
  
	  public void beforeTest() {
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\FL_LPT-510\\Downloads\\chromedriver_win32//chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	      wait = new WebDriverWait(driver, Duration.ofSeconds(60));
  }

  @AfterTest
  public void afterTest() {
  }

}

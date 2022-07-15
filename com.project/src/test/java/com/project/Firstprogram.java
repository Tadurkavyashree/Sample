package com.project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Firstprogram {
	WebDriver driver;
    WebDriverWait wait;
  @Test
  public void f() {
	  WebElement salary = driver.findElement(By.xpath("//div[@class='rt-table']//div[@class='rt-tr-group']/div/div[text()='Cierra']/following-sibling::div[4]"));
      String str = salary.getText();
      System.out.println(str);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\FL_LPT-510\\Downloads\\chromedriver_win32//chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demoqa.com/webtables");
      //wait = new WebDriverWait(driver, Duration.ofSeconds(60));
  }

  @AfterTest
  public void afterTest() {
  }

}

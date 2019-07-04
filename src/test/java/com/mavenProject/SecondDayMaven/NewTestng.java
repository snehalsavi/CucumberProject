package com.mavenProject.SecondDayMaven;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTestng {
	WebDriver driver;
	
	@Parameters("my browser")
	  @BeforeTest
	  public void beforeTest(String valueXyz) {
		  String browser= valueXyz;
		  
		  if (browser.equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		      driver= new ChromeDriver();
			
		} else if (browser.equals("firefox")) { 
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		      driver= new FirefoxDriver();
			
		}else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "Resource/IEDriverserver.exe");
		      driver= new InternetExplorerDriver();
			
		}

		
		  /*System.out.println("before test");
		  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	      driver= new ChromeDriver();*/
	      driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }

  @Test
  public void f() throws InterruptedException {
	  System.out.println("test class");
	  registerClass register= new registerClass(driver);
	  register.registermethod();
	  loginClass login= new loginClass(driver);
	  login.loginmethod();
	  Dresses d=new Dresses(driver);
	  d.selectdress();
	 

 	  
  }
  
  @AfterTest
  public void afterTest() {
	  /*driver.quit();*/
  }

}

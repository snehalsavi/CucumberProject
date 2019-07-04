package com.mavenProject.SecondDayMaven;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumClass {
	
	public class NewTestng {
		WebDriver driver;
		
		
		  @BeforeTest
		  public void BeforeTest()
		  
		  {
			
			 
			  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		      driver= new ChromeDriver();
		      //driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		  }

	  @Test(enabled=false)
	  public void windowHandleCode() {
		  driver.navigate().to("https://naukri.com");
		  String parentwindow= driver.getWindowHandle();
		  
		  Set<String> allwindow =driver.getWindowHandles();
		  
		  for (String mywindow : allwindow) {
			  driver.switchTo().window(mywindow);
			  System.out.println(driver.getTitle());
			  if (!mywindow.equals(parentwindow)) {
				  driver.close();
			  }
			  
		  }
			driver.switchTo().window(parentwindow);
			WebElement walkin=driver.findElement(By.xpath("//button[@title='Walkin Jobs']"));
			walkin.click();
			Set<String> allnewwindows= driver.getWindowHandles();
			
			
	 	  
	  }
	  
	  @Test(enabled=false)
	  public void frameHandleCode() throws InterruptedException {
		  driver.navigate().to("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		  WebElement frm=driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		  driver.switchTo().frame(frm);
		  driver.findElement(By.xpath("//a[text()='com.thoughtworks.selenium'][1]")).click();
		  
		  driver.switchTo().defaultContent();
		  Thread.sleep(2000);
		  
		  WebElement frm2=driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		  driver.switchTo().frame(frm2);
		  driver.findElement(By.xpath("//span[text()='ConditionRunner']")).click();
			
		  driver.switchTo().defaultContent();
		  Thread.sleep(2000);
		  
		  WebElement frm3=driver.findElement(By.xpath("//frame[@name='classFrame']"));
		  driver.switchTo().frame(frm3);
		  driver.findElement(By.xpath("//a[text()='Tree']")).click();
		  Thread.sleep(2000);
			
			
	 	  
	  }
	  
	  @Test(enabled=false)
	  public void ActionDragDrop() {
		  driver.navigate().to("https://jqueryui.com/droppable/");
		  WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		  driver.switchTo().frame(frame);
		  WebElement drag = driver.findElement(By.id("draggable"));
			WebElement drop = driver.findElement(By.id("droppable"));
			
			Actions act=new Actions(driver);
			act.dragAndDrop(drag, drop).perform();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		  
	 	  
	  }
	 
	  @Test(enabled=false)
	  public void ActionMouseHover() throws InterruptedException {
		  driver.navigate().to("http://court.mah.nic.in/courtweb/index.php");
		  WebElement english= driver.findElement(By.xpath("//a[text()='English']"));
		  english.click();
		  
		  Thread.sleep(2000);
		  
		  WebElement caseStatus= driver.findElement(By.xpath("//a[text()='Case Status']"));
		  WebElement fillingNumber= driver.findElement(By.xpath("//a[text()='Filing Number']]"));
		  
		  Actions act = new Actions(driver);
			act.moveToElement(caseStatus).pause(Duration.ofSeconds(3)).moveToElement(fillingNumber).click().build()
					.perform();

			Thread.sleep(2000);

			Alert alt = driver.switchTo().alert();
			Assert.assertEquals(alt.getText(), "Please Select District");
			alt.accept();

			Thread.sleep(2000);

			WebElement selectDistrict = driver.findElement(By.id("sess_dist_code"));
			Select sel = new Select(selectDistrict);
			sel.selectByIndex(3);// Amravati-अमरावती
			Thread.sleep(2000);
			sel.selectByValue("19");// Aurangabad-औरंगाबाद
			Thread.sleep(2000);
			sel.selectByVisibleText("Buldhana-बुलढाणा ");
			Thread.sleep(2000);
		}


	  @Test
	  public void WebTable() {
		  driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		  WebElement username= driver.findElement(By.id("txtUsername"));
		  username.sendKeys("admin");
		  WebElement pass= driver.findElement(By.id("txtPassword"));
		  pass.sendKeys("admin123");
		  WebElement login= driver.findElement(By.id("btnLogin"));
		  login.click();
		  
		  List<WebElement> tablecontent = driver.findElements(By.xpath("//table/tbody/tr"));
		  System.out.println(tablecontent.size());
		  
		  for(int i=1; i<= tablecontent.size(); i++) {
			  WebElement empname = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[4]"));
			  System.out.println(empname.getText());
			  
			  if ("Steven Edwards".equals(empname.getText())) {
				  driver.findElement(By.xpath("//table/tbody/tr[\"+i+\"]/td[1]/input"));
				  
				  
				  
				
			}
		  }
	  
	  }
	  
	  @AfterTest
	  public void afterTest() {
		 // driver.quit();
	  }
	}
}

	  
	


package com.mavenProject.SecondDayMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dresses {
	WebDriver driver;
	

	public Dresses(WebDriver driver2) {
		driver=driver2;
	}

	public void selectdress() throws InterruptedException
	{
		/*WebElement tshirts= driver.findElement(By.xpath("//a[@title='T-shirts'][2]"));
		tshirts.click();*/
		
		//for mouse hovering
		Thread.sleep(2000);
		WebElement dresses= driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	    WebElement eveningdresses=driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
	    Actions act=new Actions(driver);
	    act.moveToElement(dresses).pause(Duration.ofSeconds(2)).moveToElement(eveningdresses).click(eveningdresses).build().perform();
	    WebElement printeddress= driver.findElement(By.xpath("//a[@title='Printed Dress']"));
	    printeddress.click();
	    
	   /* WebElement tshirts= driver.findElement(By.xpath(".//img[@title='Faded Short Sleeve T-shirts']"));
	    tshirts.click();*/
	    WebElement frame= driver.findElement(By.xpath(".//iframe[@class='fancybox-iframe']"));
	    driver.switchTo().frame(frame);
	    
	   /* driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='fancybox-frame1558517893693']")));
	    dont take attribute having numberes it gives error*/
	    
	    WebElement addtocart= driver.findElement(By.xpath("//button[@name='Submit']"));
	    addtocart.click();
	    driver.switchTo().defaultContent();
	    Thread.sleep(5000);
	    WebElement proceedtocheckout= driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	    proceedtocheckout.click();
	    
	    /*summary page proceed*/
	    WebElement proceed= driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
	    proceed.click();
	    
	    /*address page proceed*/
	    WebElement proceedaddress= driver.findElement(By.xpath("//button[@name='processAddress']"));
	    proceedaddress.click();
	    
	    /*shipping page proceed*/
	    WebElement checkbox= driver.findElement(By.id("cgv"));
	    checkbox.click();
	    WebElement proceedshipping=driver.findElement(By.xpath("//button[@name='processCarrier']"));
	    proceedshipping.click(); 
	    
	    /*payment*/
	    WebElement payment= driver.findElement(By.xpath("//a[@title='Pay by check.']"));
	    payment.click();
	    WebElement confirmorder= driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	    confirmorder.click();
	    
	    
		
	    
	}

}

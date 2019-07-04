package com.mavenProject.SecondDayMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginClass {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement locatorofid;
	@FindBy(id="passwd")
	WebElement locatorofpassword;
	@FindBy(id="SubmitLogin")
	WebElement locatorofsignin;
	
	

	public loginClass(WebDriver driver2) {
		driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public void loginmethod()
	{
		  //WebElement emailid= driver.findElement(By.id("email"));
		locatorofid.sendKeys("snehal2@gmail.com");
	     // WebElement password= driver.findElement(By.id("passwd"));
		locatorofpassword.sendKeys("qwerty");
	     // WebElement signin= driver.findElement(By.id("SubmitLogin"));
		locatorofsignin.click();
	      
	      
		
	}

}

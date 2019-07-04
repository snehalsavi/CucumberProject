package com.mavenProject.SecondDayMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registerClass {
	WebDriver driver;
	public registerClass(WebDriver driver2) {
		driver=driver2;
	}
	public void registermethod() {
	 
    /* WebElement emailid= driver.findElement(By.id("email_create"));
     emailid.sendKeys("snehal11@gmail.com");
     WebElement createanaccount= driver.findElement(By.id("SubmitCreate"));
     createanaccount.click();
     
     WebElement title= driver.findElement(By.id("id_gender2"));
     title.click();
     WebElement firstname= driver.findElement(By.id("customer_firstname"));
     firstname.sendKeys("snehal");
     WebElement lastname= driver.findElement(By.id("customer_lastname"));
     lastname.sendKeys("kannav");
 
     WebElement password= driver.findElement(By.id("passwd"));
     password.sendKeys("qwerty");
     WebElement dOB_day= driver.findElement(By.id("days"));
     Select s= new Select( dOB_day);
     s.selectByValue("1");
     WebElement DOB_month= driver.findElement(By.id("months"));
     Select s1= new Select( DOB_month);
     s1.selectByValue("1");
     WebElement DOB_year= driver.findElement(By.id("years"));
     Select s2= new Select(DOB_year);
     s2.selectByValue("1990");
     WebElement address= driver.findElement(By.id("address1"));
     address.sendKeys("dhayri");
     WebElement city= driver.findElement(By.id("city"));
     city.sendKeys("Pune");
     WebElement state=driver.findElement(By.id("id_state"));
     Select s3= new Select(state);
     s3.selectByValue("2");
     WebElement postalcode= driver.findElement(By.id("postcode"));
     postalcode.sendKeys("12345");
     WebElement country= driver.findElement(By.id("id_country"));
     Select s4= new Select(country);
     s4.selectByValue("United States");
     
     WebElement mobilenumber= driver.findElement(By.id("phone_mobile"));
     mobilenumber.sendKeys("1234567890");
     WebElement register= driver.findElement(By.id("submitAccount"));
     register.click();*/
	}
}

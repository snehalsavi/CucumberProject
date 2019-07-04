package com.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumberclass {
WebDriver driver;
	
	@Given("^I ve the site running$")
	public void running()  
	{
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	      driver= new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^I provide correct credentails like (\\w+) and (\\w+)$")
	public void credentails(String x, String y) {
		driver.findElement(By.id("txtUsername")).sendKeys(x);
		driver.findElement(By.id("txtPassword")).sendKeys(y);
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("^I should get loggedin$")
	public void loggedin() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		  driver.quit();
	}

	@When("^I provide incorrect credentails like (\\w+) and (\\w+)$")
	public void incorrectCredentails(String a, String b) {
		driver.findElement(By.id("txtUsername")).sendKeys(a);
		driver.findElement(By.id("txtPassword")).sendKeys(b);
		driver.findElement(By.id("btnLogin")).click();
	}
	

	@Then("^I should not get loggedin$")
	public void notgetloggedin() {
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		driver.quit();  
	}

	@Then("^I want to check the title of the page$")
	public void meth()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		driver.quit();  
		
		
	}
	
}

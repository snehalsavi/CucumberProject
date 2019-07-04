package com.mavenProject.SecondDayMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-server/3.14.0");
        driver.manage().window().maximize();
        driver.quit();*/
        
     System.out.println( "Hello World!" );
        
        /*System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demosite.center/wordpress/wp-login.php?");
        driver.manage().window().maximize();
        WebElement username= driver.findElement(By.id("user_login"));
        username.sendKeys("snehal");
        WebElement password= driver.findElement(By.id("user_pass"));
        password.sendKeys("xyz");
        
        
        driver.quit();
    */
    System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("http://demosite.center/wordpress/wp-login.php?");
    driver.manage().window().maximize();
    WebElement username= driver.findElement(By.xpath("/html/body/div/form/p[4]/input"));
    username.sendKeys("snehal");
    WebElement password= driver.findElement(By.className("input"));
    password.sendKeys("xyz");
    driver.quit();
    
    
    /*System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("http://demosite.center/wordpress/wp-login.php?");
    driver.manage().window().maximize();
    WebElement lostyourpassword= driver.findElement(By.partialLink
    		lostyourpassword.click();
    driver.quit();
    */
    
    }
}

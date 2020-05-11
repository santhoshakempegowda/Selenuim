package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		/**
		 * 	xpath syntax:
		 * 
		 *  1) //tagname[@attribute='value']
		 * 	2) //*[@attribute='value'] --- * accepts any tag name, this will only look for attribute and skips tag name
		 
		 * xpath Regular Expresiion syntax:
		 * //tagname[contains(@attribute,value)]
		 *
		 */
		
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://facebook.com");
		 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
		 * driver.findElement(By.xpath("//*[@data-testid='royal_pass']")).sendKeys(
		 * "hello");
		 * driver.findElement(By.xpath("//*[@aria-label=\"Log In\"]")).click();
		 */

		//rediff
		/*
		 * 
		
		  driver.get("https://mail.rediff.com");
		  driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
		  driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		  driver.findElement(By.xpath("//input[contains(@name,'wd')]")).sendKeys("hello"); 
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  driver.findElement(By.xpath("//a[contains(@href, 'user')]")).click();
		*/
		 
		
		//salesForce
		/*
		 * driver.get("https://login.salesforce.com");
		 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		 * driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("admin");
		 * driver.findElement(By.xpath("//*[@value='Log In']")).click();
		 */
		
		//Flipkart
		
		  driver.get("https://www.flipkart.com");
		  driver.findElement(By.linkText("Login & Signup")).click();
		 
		
		
		//yahoo.com --> not working check with nandish
		/*
		 * driver.get("https://in.yahoo.com");
		 * driver.findElement(By.linkText(" \"Sign In\" ")).click();
		 */
		
	}

}

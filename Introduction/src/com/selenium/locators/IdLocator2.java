package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver_win32\\chromedriver.exe");
		
		/*
		 *  WebDriver driver = new ChromeDriver(); driver.get("http://gmail.com");
		  driver.findElement(By.id("identifierId")).sendKeys("santho.cse");
		  driver.findElement(By.id("identifierNext")).click();
		  //driver.findElement(By.cssSelector("input.whsOnd.zHQkBf")).sendKeys("manigere");
		  System.out.println(driver.findElement(By.xpath("//div[@class='Xb9hP']/input")).getLocation());
		  driver.findElement(By.xpath("//div[@class='zQJV3']/div/div[2]/div/content/span")).click();
		 * 
		 */
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pw")).sendKeys("admin");
		 driver.findElement(By.id("Login")).click();
		 driver.findElement(By.linkText("Forgot Your Password?")).click();
		 driver.findElement(By.linkText("Need Help Logging In?")).click();
		 

	}

}

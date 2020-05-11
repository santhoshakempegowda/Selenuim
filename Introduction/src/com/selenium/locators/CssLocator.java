package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		/**
		 * Css syntax: 
		 *  1) tagname[attribute='value']
		 *  2) //[attribute='value'] --- * accepts any tag name, this will only look for attribute and skips tag name
		 *  3) tagname#id ---> works only with id attribute, if "id" attribute is not present then you cannot use this
		 *  4) tagname.classname --> works only with classname
		 *  5) #id --> skips tagname
		 *  6) .classname --> skips tagname
		 *  
		 *  CSS Regular Expression syntax:
		 *  tagname[attribute*='value'] --> * is used for RE
		 *
		 */
		
		
		
		//driver.get("https://login.salesforce.com");
		/*
		 * driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("hello");
		 * driver.findElement(By.cssSelector(
		 * "input#password.input.r4.wide.mb16.mt8.password")).sendKeys("hello");
		 * driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).
		 * click();
		 * System.out.println(driver.findElement(By.cssSelector("div#error.loginError"))
		 * .getText());
		 */
		
		//salesforce
		/*
		 * driver.findElement(By.
		 * cssSelector("input[class='input r4 wide mb16 mt8 username']")).sendKeys(
		 * "hello");
		 * driver.findElement(By.cssSelector("*[type='password']")).sendKeys("hello");
		 * driver.findElement(By.cssSelector("*[value='Log In']")).click();
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "div[class='loginError']")));
		 * System.out.println("is selected "+driver.findElement(By.cssSelector(
		 * "[type='checkbox']")).isSelected());
		 * driver.findElement(By.cssSelector("[type='checkbox']")).click();
		 */
		
		//rediff
		
		/*
		 * driver.get("https://www.rediff.com/");
		 * driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		 * driver.findElement(By.cssSelector("[name='login']")).sendKeys("hello");
		 * driver.findElement(By.cssSelector("[name*='wd']")).sendKeys("hello");
		 * driver.findElement(By.cssSelector("[type='submit']")).click();
		 * 
		 * //driver.findElement(By.cssSelector("a[href*='register']")).click();
		 * driver.findElement(By.cssSelector("a[href*='user_details']")).click();
		 * 
		 */
		
		//facebook
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.cssSelector("input[name='email']")).sendKeys("santho2112@gmail.com");
		  driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("skgfms@!17");
		 driver.findElement(By.cssSelector("[name='login']")).click();
		 
	}

}

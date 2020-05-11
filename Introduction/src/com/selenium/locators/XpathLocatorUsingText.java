package com.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * In this we use text of the field names,tabs to locate the elements
 *  syntax:
 *  //*[text()=' text ']
 *  
 *  Note: If there are empty space long with the text we need to include space as well in expression
 */

public class XpathLocatorUsingText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[text()='Use Custom Domain']")).click();

	}

}

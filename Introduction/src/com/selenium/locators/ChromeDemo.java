package com.selenium.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.co.in");
		System.out.println("Tittle :: " + driver.getTitle());
		System.out.println("Current URL : "+driver.getCurrentUrl());
		//System.out.println("Source code : " + driver.getPageSource());
		
		driver.get("http://yahoo.com");
		System.out.println("Current URL : "+driver.getCurrentUrl()); //to validate Url
		driver.navigate().back();
		System.out.println("Current URL : "+driver.getCurrentUrl());
		driver.navigate().forward();
		driver.get("http://facebook.com");
		System.out.println("Current URL : "+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Current URL : "+driver.getCurrentUrl());
		driver.navigate().back();
		
		//System.out.println(driver.getPageSource()); //To print page source where right click is disabled
		driver.close(); 
		//driver.quit();

	}

}

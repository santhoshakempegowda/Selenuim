package com.selenium.UI.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.cssSelector("[name='origin']")).clear();
		Thread.sleep(3000);
		//driver.switchTo().;
		//driver.findElement(By.cssSelector("[name='origin']")).sendKeys("ban");
		//Thread.sleep(1000);
		

	}

}

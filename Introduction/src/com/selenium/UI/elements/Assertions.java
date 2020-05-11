package com.selenium.UI.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement checkbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		
		
		  Assert.assertFalse(checkbox.isSelected()); 
		  checkbox.click();
		  Assert.assertTrue(checkbox.isSelected(), "Check box selected");
		  
		  driver.findElement(By.id("divpaxinfo")).click();
		  Thread.sleep(1000);
		  Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		 s.selectByIndex(4);
		 
		  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		 

	}

}

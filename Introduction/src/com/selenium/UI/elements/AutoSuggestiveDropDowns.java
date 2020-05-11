package com.selenium.UI.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		/*
		 * Here we are doing a click operation to open the drop down, other wise selenium will not be able to find the element id drop down is closed
		 */
		
		driver.findElement(By.id("fromCity")).click();;
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.clear();
		from.sendKeys("BANG");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("toCity")).click();
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.clear();
		to.sendKeys("MUM");
		Thread.sleep(2000);
		for(int i=0;i<5;i++)
			to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		

	}

}

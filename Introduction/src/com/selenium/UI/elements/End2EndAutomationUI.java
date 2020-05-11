package com.selenium.UI.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2EndAutomationUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement from = 	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		from.click();
		from.sendKeys("ban");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JAI']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByIndex(4);
		
		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByIndex(3);
		
		Select infant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		infant.selectByIndex(2);
		
		Thread.sleep(1000);
		Select currency = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		currency.selectByIndex(3);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
	
		

	}

}

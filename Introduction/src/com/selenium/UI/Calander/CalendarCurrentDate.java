package com.selenium.UI.Calander;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarCurrentDate {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		/*
		 * Here we are doing a click operation to open the drop down, other wise selenium will not be able to find the element id drop down is closed
		 */
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(1000L);
		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='HBX']")).click();
		/*
		 * Here since we are using parent div the search happens within that parent Div, so we are not using index
		 * NOTE: here we have to include space as well
		 */
		
		/*
		 * ui-state-default ui-state-highlight ui-state-active --> class name for current date
		 * We are going to use css selector to get current Date by using above class name which is unique only  for current date.
		 *  But the class name contains space so we should replace space with dot (.)
		 *  so class name will be ui-state-default.ui-state-highlight.ui-state-active
		 * shortcut for class name css selector is .classname, for id its #id
		 */	
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
	}

}

package com.selenium.UI.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownUsingParentChildRelationShip {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		
		
	}

}

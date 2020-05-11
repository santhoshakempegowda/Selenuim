package com.selenium.UI.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		driver.findElement(By.cssSelector(".select_CTXT")).click();
		
		Thread.sleep(1000L);
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		/*
		 *  In Below expression we are [2] because HBX exists in both the From and To drop downs , 
		 *  If we do not specify [2] , selenium will by default start scanning from Top  Left and will pick the first element .i.e the one in From Drop Down
		 *  By specifying [2] we are instructing selenium to select the second value i.e select from the second drop down (To drop down)
		 */
		//driver.findElement(By.xpath("(//a[@value='HBX'])[2]")).click();
		driver.findElement(By.cssSelector("a[value='HBX']nth-child(2)")).click();
		
	}

}

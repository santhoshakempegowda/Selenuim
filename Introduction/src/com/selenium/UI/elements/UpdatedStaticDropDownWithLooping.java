package com.selenium.UI.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedStaticDropDownWithLooping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		/*
		 * Here we are doing a click operation to open the drop down, other wise selenium will not be able to find the element id drop down is closed
		 */
		
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(1000L);
		for(int i=1;i<5;i++)
			driver.findElement(By.id("hrefIncAdt")).click();
		for(int i=1;i<4;i++)
			driver.findElement(By.id("hrefIncChd")).click();
		for(int i=1;i<3;i++)
			driver.findElement(By.id("hrefIncInf")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("hrefDecInf")).click();
		driver.findElement(By.id("hrefDecChd")).click();
		driver.findElement(By.id("hrefDecAdt")).click();
		
		driver.findElement(By.cssSelector("[value='Done']")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}

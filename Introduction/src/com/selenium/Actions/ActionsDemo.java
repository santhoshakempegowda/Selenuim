package com.selenium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Login & Signup"));
		driver.findElement(By.cssSelector("div[class='_3Njdz7'] button")).click();
		action.moveToElement(element).contextClick().build().perform(); //right click
		
		
		action.moveToElement(driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("hello").doubleClick()
				.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).pause(1L).sendKeys(Keys.ENTER)
				.build().perform();
		System.out.println("Done !!!!!!!!!!");
	}

}

package com.selenium.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.cssSelector("._2AkmmA._29YdH8")).click();;
		driver.findElement(By.cssSelector("div[class='_3Njdz7'] button")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("._2aUbKa"))).build().perform();

	}

}

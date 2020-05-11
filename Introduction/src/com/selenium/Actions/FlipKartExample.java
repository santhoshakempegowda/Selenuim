package com.selenium.Actions;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKartExample {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Login & Signup"));
		driver.findElement(By.cssSelector("div[class='_3Njdz7'] button")).click();
		
		WebElement electronics = driver.findElement(By.xpath("//div[@class='_3zdbog _3Ed3Ub']/ul/li/span"));
		action.moveToElement(electronics).build().perform();
		
		WebDriverWait explicitWait = new WebDriverWait(driver,5);
		//explicitWait.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(By.linkText("Smart Wearable Tech"));
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Smart Wearable Tech")));
		System.out.println("Finished Waiting !!!!!!!!!!");
		//driver.findElement(By.linkText("Smart Wearable Tech")).click();
		//action.moveToElement(driver.findElement(By.linkText("Smart Watches"))).clickAndHold().build().perform();
		action.moveToElement(driver.findElement(By.linkText("Smart Watches"))).click().build().perform();
		System.out.println("Done !!!!!!!!");

	}

}

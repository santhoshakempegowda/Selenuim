package com.selenium.UI.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class CheckBoxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
		checkBox.click();
		Assert.assertTrue(checkBox.isSelected());
		System.out.println(checkBox.isSelected());
		Thread.sleep(3000);
		checkBox.click();;
		Assert.assertFalse(checkBox.isSelected());
		System.out.println(checkBox.isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@tyep='checkbox]")).size());

	}

}

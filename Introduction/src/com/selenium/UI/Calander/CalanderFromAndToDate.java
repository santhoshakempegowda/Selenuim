package com.selenium.UI.Calander;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalanderFromAndToDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		String css = "div[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right'] div[class='ui-datepicker-title']";
		WebElement element1 = driver.findElement(By.cssSelector("div[id='ui-datepicker-div'] div[class='ui-datepicker-group ui-datepicker-group-last']"));
		String next = "[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right'] a[title='Next']";
		Actions actions = new Actions(driver);
		System.out.println("@@@@ " + element1.findElement(By.cssSelector(css)).getText());
		WebDriverWait expicitWait = new WebDriverWait(driver, 5);
		
		while(!element1.findElement(By.cssSelector(css)).getText().equalsIgnoreCase("February 2020")) {
			System.out.println("!!!!!!!!!! "+ element1.findElement(By.cssSelector(css)).getText());
			actions.moveToElement(element1.findElement(By.cssSelector(next))).click().build().perform();
			int i=1;
			System.out.println("click no " + i);
			i++;
			System.out.println(System.currentTimeMillis());
			expicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")));
			System.out.println(System.currentTimeMillis());
			System.out.println(element1.findElement(By.cssSelector("div[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']")));
			
			//element1.findElement(By.cssSelector(next)).click();
			//actions.moveToElement(element1.findElement(By.cssSelector(next))).click().build().perform();
		}

	}

}

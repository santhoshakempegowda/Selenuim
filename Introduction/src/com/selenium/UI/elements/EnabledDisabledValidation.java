package com.selenium.UI.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledDisabledValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		System.out.println("isEnabled() : "+driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println("isDisplayed() : "+driver.findElement(By.id("ctl00_mainContent_view_date2")).isDisplayed());
		/*
		 * Here before click of round trip date element is showing enabled cause in current technology if we click on disabled field it gets enabled automatically.
		 * This is achieved by just changing a value of a attribute , so selenium driver is not able to identify the disabled field
		 * 
		 */
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println("isEnabled() : "+driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println("isDisplayed() : "+driver.findElement(By.id("ctl00_mainContent_view_date2")).isDisplayed());
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1")){
			System.out.println("Enabled");
		}
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 0.5")){
			System.out.println("Disbaled");
		}
	}

}

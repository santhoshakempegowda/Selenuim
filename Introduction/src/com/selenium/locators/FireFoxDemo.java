package com.selenium.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\software\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.co.in");
		System.out.println("Tittle :: "+ driver.getTitle());

	}

}

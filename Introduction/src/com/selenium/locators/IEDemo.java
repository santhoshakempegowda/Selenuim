package com.selenium.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\software\\MicrosoftWebDriver.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.co.in");
		System.out.println("Tittle :: " + driver.getTitle());

	}

}

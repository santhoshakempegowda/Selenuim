package com.selenium.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaDriverDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver", "C:\\software\\operadriver_win64\\operadriver.exe");
		
		WebDriver driver = new OperaDriver();
		driver.get("http://google.co.in");
		System.out.println("Tittle :: "+driver.getTitle());

	}

}

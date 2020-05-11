package com.selenium.miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String opt = "";
		if(driver.findElement(By.id("checkBoxOption2")).isSelected()){
			System.out.println(" Selected id true:: ");
			opt = driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).getAttribute("value");
			System.out.println(" Selected :: " + driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).getAttribute("value"));
			
		}
		
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(opt);
		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String alerttext = driver.switchTo().alert().getText();
		if(alerttext.contains(opt))
			System.out.println(" Alert text message contains "+ opt);
		driver.switchTo().alert().accept();
		System.out.println("Done !!!!!!!!!!!!");
		
		
		

	}

}

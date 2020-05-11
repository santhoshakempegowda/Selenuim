package com.selenium.childWindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/servicelogin");
		driver.findElement(By.xpath("//div[@class='daaWTb']/div/div/span/span")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='JPdR6b ILYVD qjTEB']/div/div/span[1]/div[2]/div")).click();
		System.out.println("Before Switchhing :: " + driver.getTitle());
		Set<String> handles = driver.getWindowHandles();
		System.out.println("handles @@ " + handles);
		Iterator<String> it = handles.iterator();
		String parentId = it.next();
		//String childId = it.next();
		driver.switchTo().window(parentId);
		System.out.println("After Switching :: "+driver.getTitle());
		
		driver.switchTo().window(parentId);
		System.out.println("Switced back to parentId :: "+ driver.getTitle());
		

	}

}

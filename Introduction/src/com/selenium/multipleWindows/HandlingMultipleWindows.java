package com.selenium.multipleWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/servicelogin");
		driver.findElement(By.linkText("Help")).click();
		System.out.println("Brfore switch " + driver.getTitle());
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("handles @@ " + handles);
		Iterator<String> iterator = handles.iterator();
		System.out.println("iterator " +iterator);
		String parent = iterator.next();
		String fisrtchild = iterator.next();
		driver.switchTo().window(fisrtchild);
		System.out.println("After switching " + driver.getTitle());
		
		driver.switchTo().window(parent);
		System.out.println("switching Back " + driver.getTitle());
		driver.findElement(By.linkText("Privacy")).click();
		handles = driver.getWindowHandles();
		System.out.println("handles " + handles);
		iterator = handles.iterator();
		System.out.println("iterator " +iterator);
		parent = iterator.next();
		fisrtchild = iterator.next();
		String secondChild = iterator.next();
		driver.switchTo().window(fisrtchild);
		System.out.println("fisrtchild " + driver.getTitle());
		driver.switchTo().window(secondChild);
		System.out.println("secondChild " + driver.getTitle());
		driver.switchTo().window(parent);
		
	}

}

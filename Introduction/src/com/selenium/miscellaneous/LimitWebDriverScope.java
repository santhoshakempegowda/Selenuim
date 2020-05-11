package com.selenium.miscellaneous;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitWebDriverScope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		/*
		 *  we can use an element to limit the scope of web driver
		 *  web driver will have access to entire page.
		 *  suppose if you want to limit the driver to Footer element then get the web element and that element will start behaving as driver with limited scope to that element.
		 */
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//limit to Latest News from footerDriver
		WebElement latestNewsDriver = footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		List<WebElement> list = latestNewsDriver.findElements(By.tagName("a"));
		System.out.println(list.size());
		System.out.println(" !!!!!!!!! "+ latestNewsDriver.getText());
		
		//click on each individual link from Discount Coupons
		for(WebElement element: list) {
			
			/*
			 *  here we are sending control + enter keys to open in a new tab.
			 *  If we do not open in new tab then after click the first link a new page opens and driver will not be able to find the next element in the list
			 *  as we have landed in new page and driver will try to find that element in that page which does not exist
			 */
			String controlEnter = Keys.chord(Keys.CONTROL,Keys.ENTER);
			element.sendKeys(controlEnter);
		}
		
		//get title of all the child windows
		Set<String> windows = driver.getWindowHandles();
		for(String s:windows) {
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
		}
		

	}

}

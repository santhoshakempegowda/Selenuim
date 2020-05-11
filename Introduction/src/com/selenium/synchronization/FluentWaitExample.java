package com.selenium.synchronization;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static <T> void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		Wait<WebDriver> fluentWait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
											.withTimeout(Duration.ofSeconds(30L))
											.pollingEvery(Duration.ofSeconds(3))
											.ignoring(NoSuchElementException.class);
		
		WebElement wait = fluentWait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				System.out.println("$$$$$$$$ "+driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed());
				if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed())
					return driver.findElement(By.cssSelector("div[id='finish'] h4"));
				else
					return null;
			}
		});
		
		System.out.println("!!!!!!!!! " + wait.getTagName());
		System.out.println("********* " + wait.getText());


	}

}

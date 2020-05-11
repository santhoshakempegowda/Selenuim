package com.selenium.cart.example;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		String[] products = {"Cucumber - 1 Kg", "Beans - 1 Kg",""};
		List<String> productList = Arrays.asList(products);
		
		List<WebElement> webElementList =	driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> incrementList = driver.findElements(By.className("increment"));
		System.out.println("incrementList size :: " + incrementList.size());
		for(int i=0;i<webElementList.size();i++) {
			//System.out.println(webElementList.get(i).getText());
			if(productList.contains(webElementList.get(i).getText())) {
				for(int j=1;j<5;j++)
					incrementList.get(i).click();
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println("Done !!!!!");
				
			}
				
		}

	}

}

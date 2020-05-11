package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmailAdaptor {
	
	@Test
	public void poolInbox() {
		System.out.println("pooling Inbox");
	}
	
	@Test
	public void updatepoolingStatus() {
		System.out.println("updatepoolingStatus");
	}
	
	@Test
	public void poolErrorFolder() {
		System.out.println("poolErrorFolder");
	}
	
	//BeforTest is for entire test suite, it executes only once for entire test suite and executes before all the @Test methods 
	@BeforeTest(groups= {"smoke"})
	public void init() {
		System.out.println("Before Test in EmailAdaptor");
	}
	
	//AfterTest is for entire test suite, it executes only once for entire test suite and executes after all the @Test methods complete 
	@AfterTest
	public void moveToArchiveFolder() {
		System.out.println("AfterTest in EmailAdapter");
	}
	
	@BeforeMethod
	public void checkEmailAccount() {
		System.out.println("Before method in EmailAdaptor");
	}
	
	@AfterMethod
	public void closeEmail() {
		System.out.println("After method in EmailAdaptor");
	}

}

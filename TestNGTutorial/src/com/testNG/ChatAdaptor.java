package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChatAdaptor {
	
	//@Test(enabled=false)
	@Test
	public void initiateChat() {
		System.out.println("initiateChat");
	}
	
	@Test
	public void wrapUpChat() {
		System.out.println("wrapUpChat");
	}
	
	@BeforeTest
	public void init() {
		System.out.println("Before Test in ChatAdaptor");
	}
	
	@AfterTest(groups= {"smoke"})
	public void ConversationComplete() {
		System.out.println("After Test in ChatAdapter");
	}
	
	@BeforeMethod
	public void checkChatConf() {
		System.out.println("Before method in ChatAdapter");
	}
	
	@AfterMethod
	public void closeChat() {
		System.out.println("After Method in ChatAdapter");
	}
	

}

package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MccgDemo {
	
	@BeforeTest
	public void init() {
		System.out.println("init in MccgDemo");
	}
	
	@Test
	public void call() {
		System.out.println("inside Mccg Call");
	}
	@Test
	public void checkGateWay() {
		System.out.println("checkGateWay");
	}
	@Test
	public void checkQueue() {
		System.out.println("checkQueue");
	}
	
	@Test(groups= {"smoke"},dependsOnMethods= {"checkGateWay","checkQueue"})
	public void ruote() {
		System.out.println("inside Mccg route");
	}
	
	@BeforeMethod
	public void checkConnectivity() {
		System.out.println("checkConnectivity fro Mccg");
	}
	
	@AfterMethod
	public void closeConnectivity() {
		System.out.println("closeConnectivity fro Mccg");
	}

}

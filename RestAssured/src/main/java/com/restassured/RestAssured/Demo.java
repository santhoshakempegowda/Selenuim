package com.restassured.RestAssured;

import static io.restassured.RestAssured.given;

import org.hamcrest.CoreMatchers;
import org.testng.annotations.Test;

public class Demo {
	
	@Test(enabled = false)
	public void one() {
		System.out.println("one");
		//System.out.println(get("http://localhost:3000/first").asString());
		given().get("http://localhost:3000/first").then().statusCode(400);
		
	}
	
	@Test(enabled = false)
	public void matcher() {
		given().get("http://localhost:3000/first").then().statusCode(CoreMatchers.equalTo(200));
	}
	
	@Test
	public void asserThat() {
		given().get("http://localhost:3000/first").then().assertThat().statusCode(210);
	}

}

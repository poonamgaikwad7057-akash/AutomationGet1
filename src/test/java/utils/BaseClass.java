package utils;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	public static RequestSpecification request;
	
	public static void setup() {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		request = RestAssured
				.given()
				.contentType("application/json");
	}
}

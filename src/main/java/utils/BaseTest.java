package utils;

import static io.restassured.RestAssured.given;
import static utils.CredentialManager.getAPIKey;
import static utils.CredentialManager.getToken;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseTest {

	protected static RequestSpecification requestSpec;
	protected static ResponseSpecification responseSpec;
	
	@BeforeTest
	public void setUp() {
		
		RestAssured.baseURI = ConfigManager.getProperty("baseURI");
		 requestSpec = new RequestSpecBuilder()
				.addQueryParam("key", getAPIKey())
				.addQueryParam("token", getToken())
				.addHeader("content-type", "application/json").build();
		 
		 responseSpec = new ResponseSpecBuilder()
					.expectStatusCode(200).build();
	}

	
}

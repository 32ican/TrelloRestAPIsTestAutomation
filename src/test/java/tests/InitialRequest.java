package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import utils.CredentialManager;

import static utils.CredentialManager.*;



public class InitialRequest{
	

	@Test
	public void initialRequestTest()  {
		
		
		RestAssured.baseURI = "https://api.trello.com/1/";
		RestAssured.basePath = "members/me";
		
		String response = given()
		.header("content-type", "application/json")
		.queryParam("key", getAPIKey())
		.queryParam("token", getToken())
		.queryParam("bords", "open")
		.when().get()
		.then().assertThat().statusCode(200)
		.extract().body().asString();
		
		System.out.println("Response " + response);
		
	}

}

package tests;

import static io.restassured.RestAssured.given;
import static utils.CredentialManager.getAPIKey;
import static utils.CredentialManager.getToken;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class NumberOfBoards {

	
	@Test()
	public void getTheNumberOfBoards(){
		RestAssured.baseURI = "https://api.trello.com/1";
		RestAssured.basePath = "/members/me/";
		
		
		
		given()
			.queryParam("key", getAPIKey())
			.queryParam("token", getToken())
			.when()
			.get().then().log().all();
		
	}
	
}

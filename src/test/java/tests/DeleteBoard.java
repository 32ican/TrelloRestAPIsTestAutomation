package tests;

import static io.restassured.RestAssured.given;
import static utils.CredentialManager.getAPIKey;
import static utils.CredentialManager.getToken;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import utils.ConfigManager;

public class DeleteBoard {

	
	@Test
	public void deleteBorad() {
		
		RestAssured.baseURI = "https://api.trello.com/1";
		RestAssured.basePath = "/boards/";
		
		given()
		.pathParam("id", ConfigManager.getProperty("boardId"))
				.header("content-type", "application/json")
        .queryParam("key", getAPIKey())
        .queryParam("token", getToken())
        
        
        .when()
        .delete("{id}")
        .then().log().all().statusCode(200);
		
	}
}

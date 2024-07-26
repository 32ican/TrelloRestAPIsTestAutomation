package tests;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojos.Board;
import utils.ConfigManager;

import static io.restassured.RestAssured.*;
import static utils.CredentialManager.*;


public class CreateBoard {
		
	private final static String BOARD_NAME = "Test3";
	
	@Test
	public void createBoard() {
		
		RestAssured.baseURI = ConfigManager.getProperty("baseURI");

		Board board = given()
				.header("content-type", "application/json")
				.queryParam("key", getAPIKey())
				.queryParam("token", getToken())
				.queryParam("name", BOARD_NAME)
				.queryParam("defaultLabels", true)
				.queryParam("defaultLists", true)
				.when()
				.post("/boards/")
				.then().log().all()
				.extract().as(Board.class);
        
		System.out.println("Board Name is: " + board.getName());
		
		ConfigManager.setProperty("boardId", board.getId());
		
	}
	
	
	
}

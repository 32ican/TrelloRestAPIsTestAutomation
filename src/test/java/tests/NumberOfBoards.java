package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojos.ExistingBoards;
import utils.BaseTest;
import utils.ConfigManager;

public class NumberOfBoards extends BaseTest{

	
	private int expectedMinNumOfBoards = 1; 
	
	@Test()
	public void getTheNumberOfBoards(){
		
		ExistingBoards boards = 
				given()
				.spec(requestSpec)
				
			.when()
			.get("members/me/").
			then().log().all().extract().as(ExistingBoards.class);
		
		// Verify that number of boards is greater than 1
		SoftAssert softAssert = new SoftAssert();
		int actualBoardsNum = boards.getIdBoards().size();
		softAssert.assertTrue(actualBoardsNum > expectedMinNumOfBoards, "Number Of Boards must be greater than 1");
		
		// set first board id and last board id in the config.properties file
		ConfigManager.setProperty("firstBoardID", boards.getIdBoards().get(0));
		ConfigManager.setProperty("lastBoardId", boards.getIdBoards().get(actualBoardsNum-1));
		
	}
	
}

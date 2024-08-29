package tests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojos.Board;
import utils.BaseTest;
import utils.ConfigManager;

import static io.restassured.RestAssured.*;


public class CreateBoard extends BaseTest{
		
	private final static String BOARD_NAME = "Test5";
	private boolean expectedClosedParam = false;
	private String expectedPermissionParam = "private";
	private boolean expectedCanBePublicParam = true;
	private boolean expectedCanInviteParam = true;
	
	@Test
	public void createBoard() {

		Board board = given()
				.spec(requestSpec)
				.queryParam("name", BOARD_NAME)
				.queryParam("defaultLabels", true)
				.queryParam("defaultLists", true)
				.when()
				.post("/boards/")
				.then().log().all()
				.spec(responseSpec)
				.extract().as(Board.class);
       
		// saving the board id in the config.properties file
		ConfigManager.setProperty("lastBoardId", board.getId());
		
		// verify some values in the response
		
		
		boolean actualClosedParam = board.isClosed();
		String actualPermissionLevel = board.getPrefs().getPermissionLevel();
		boolean actualCanBePublicParam = board.getPrefs().isCanBePublic();
		boolean actualCanInviteParam = board.getPrefs().isCanInvite();
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualClosedParam, expectedClosedParam, "The Closed Parameter should be false");
		softAssert.assertEquals(expectedPermissionParam, actualPermissionLevel, "Actual Permission Level should be private");
		softAssert.assertEquals(expectedCanInviteParam, actualCanInviteParam, "Actual canInvite Parameter should be true");
		softAssert.assertEquals(expectedCanBePublicParam, actualCanBePublicParam,
				"canBePublicParam should be true");
		
		
	}
	
	
	
}

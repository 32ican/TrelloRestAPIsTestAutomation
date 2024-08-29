package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojos.DeleteMessage;
import utils.BaseTest;
import utils.ConfigManager;

public class DeleteBoard extends BaseTest{

	private String lastBoardId = ConfigManager.getProperty("lastBoardId");
	private String expectedMessage = "board is removed successfully";
	
	@Test
	public void deleteBorad() {
		
		//RestAssured.basePath = "/boards/";
		
		DeleteMessage message =
		
		given()
		.spec(requestSpec)
		.pathParam("id", lastBoardId)

        .when()
        .delete("/boards/{id}")
        .then()
        .log().all()
        .spec(responseSpec)
        .extract().as(DeleteMessage.class);
	
		// Verify that the response body contains a meaningful message
		SoftAssert softAssert = new SoftAssert();
		String actualMessage = message.getValue().toString();
		softAssert.assertEquals(actualMessage, expectedMessage, 
				"Response Body should contain the following message: board is removed successfully");
		
		
	}
}

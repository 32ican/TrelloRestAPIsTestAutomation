package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojos.Archiving;

import static io.restassured.RestAssured.*;

import utils.BaseTest;
import utils.ConfigManager;

public class ArchivingList extends BaseTest {
	
	private String id = ConfigManager.getProperty("listId");
	private boolean value = true;
	
	@Test
	public void archiveList() {
		
		Archiving archive = given().spec(requestSpec)
					.pathParam("id", id)
					.queryParam("value", value)
					.when()
					.put("lists/{id}/closed")
					.then().log().all()
					.spec(responseSpec).extract().as(Archiving.class);
	
		SoftAssert softAssert = new SoftAssert();
		boolean actualClosedValue = archive.getClosed();
		softAssert.assertEquals(actualClosedValue, value);
	
		
	}

}

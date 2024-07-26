package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import utils.BaseTest;
import utils.ConfigManager;

public class ArchivingList extends BaseTest {
	
	private String id = ConfigManager.getProperty("listId");
	private boolean value = false;
	
	@Test
	public void archiveList() {
		
		given().spec(requestSpec)
					.pathParam("id", id)
					.queryParam("value", value)
					.when()
					.put("lists/{id}/closed")
					.then().log().all()
					.spec(responseSpec);
					
	}

}

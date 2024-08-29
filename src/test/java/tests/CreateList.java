package tests;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojos.BoardList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import utils.BaseTest;
import utils.ConfigManager;

public class CreateList extends BaseTest{

	private String listName = "Test8 List from API";
	
	@Test
	public void createList() {
		 
		ObjectMapper mapper = new ObjectMapper();
		SoftAssert softAssert = new SoftAssert();
		
		Response response = 
		given(requestSpec)
		.queryParam("name", listName)
		.queryParam("idBoard", ConfigManager.getProperty("lastBoardId"))
		.when()
		.post("lists")
		.then()
		.log().all().extract().response();
	
		try {
			 BoardList list = mapper.readValue(response.asString(), BoardList.class);
			ConfigManager.setProperty("listId", list.getId());
			
			// Verify limits are empty object
			
			String expectedLimits = list.getSoftLimit();
			String actualLimits = null;
			softAssert.assertEquals(actualLimits, expectedLimits);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		//verify response keys
		System.out.println(response.asString().contains("id") + "\n" + response.asString());
		softAssert.assertTrue(response.asString().contains("id") && response.asString().contains("name")
				&& response.asString().contains("idBoard"));
		
		
		
	}
	
	
}

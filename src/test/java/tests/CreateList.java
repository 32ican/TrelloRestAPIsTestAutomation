package tests;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import pojos.BoardList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import utils.BaseTest;
import utils.ConfigManager;

public class CreateList extends BaseTest{

	private String listName = "Test List from API";
	
	@Test
	public void createList() {
		
		ObjectMapper mapper = new ObjectMapper();
		
		Response response = 
		given(requestSpec)
		.queryParam("name", listName)
		.queryParam("idBoard", ConfigManager.getProperty("boardId"))
		.when()
		.post("lists")
		.then()
		.log().all().extract().response();
		
		try {
			BoardList list = mapper.readValue(response.asString(), BoardList.class);
			ConfigManager.setProperty("listId", list.getId());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
}

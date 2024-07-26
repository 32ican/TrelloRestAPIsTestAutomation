package tests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import pojos.BoardList;
import utils.BaseTest;
import utils.ConfigManager;

import static io.restassured.RestAssured.*;


public class ListsOnBoard extends BaseTest{

	
	@Test
	public void getAllListsOnBoard() {
		
		// 1st Solution
				BoardList [] lists = 
				
						given().spec(requestSpec)
						.pathParam("id", ConfigManager.getProperty("boardId"))
						.when()
						.get("/boards/{id}/lists")
							.then()
							.statusCode(200)
							.log().all().extract().as(BoardList [].class);
				
				String name = lists[1].getName();
				System.out.println("\nName of the list " + name +  "......................");
				
				
				
				// 2nd Solution for deserialization using ObjectMapper from Jackson lib.
		Response  response = 
				given().spec(requestSpec)
				.pathParam("id", ConfigManager.getProperty("boardId"))
				.when()
				.get("/boards/{id}/lists")
				.then()
				.statusCode(200).extract().response();
		
			   ObjectMapper mapper = new ObjectMapper();
			     BoardList[] bordLists;
			     
				try {
					bordLists = mapper.readValue(response.asString(), BoardList[].class);
					String listName =  bordLists[0].getName();
				    System.out.println("\nName of the list " + listName + "..........!\n");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
			    
		
		
		
		
	}
	
	
}

package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import utils.BaseTest;

public class InitialRequest extends BaseTest{
	

	@Test
	public void initialRequestTest()  {
		
		
		RestAssured.baseURI = "https://api.trello.com/1/";
		
		String response = given()
		.spec(requestSpec)
		.queryParam("bords", "open")
		.when().get("members/me")
		.then().assertThat()
		.spec(responseSpec)
		.extract().body().asString();
		
		System.out.println("Response " + response);
		
	}

}

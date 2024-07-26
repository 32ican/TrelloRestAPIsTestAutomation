package tests;

import org.testng.annotations.Test;

import utils.ConfigManager;

public class TestConfigs {

	@Test
	public void testGetProperty() {
		System.out.println("BoardID is: " + ConfigManager.getProperty("boardId"));
	}
	
	@Test
	public void testSetProperty() {
		ConfigManager.setProperty("baseURI", "mofid.com");
		System.out.println("BaseURI is "+ ConfigManager.getProperty("baseURI"));
		System.out.println("BoardID is: " + ConfigManager.getProperty("boardId"));
	}
	
	@Test
	public void testGetAfterSet() {
		
	}
	
	
}

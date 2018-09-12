package com.amazon.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.base.BaseTest;
import com.amazon.pages.SearchResultsPage;

public class SearchResultsTest extends BaseTest {
	Logger log=LogManager.getLogger(HomePageTest.class);
	SearchResultsPage sr;
	
	@Test(priority=3)
	public void searchResultsSelectionTest() {
		log.info("SearchResults Test starting");
		sr =new SearchResultsPage(driver);
		
		sr.searchResultsSelection() ;
		System.out.println(driver.getTitle());
	}
	

}

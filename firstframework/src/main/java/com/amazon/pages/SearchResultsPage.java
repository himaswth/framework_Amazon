package com.amazon.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.amazon.test.HomePageTest;

public class SearchResultsPage extends HomePage{
	
	
	
	
	@FindBy(how=How.CSS,using="[data-asin='B079TGL2BZ'] [class='a-row a-spacing-none scx-truncate-medium sx-line-clamp-2']")
	WebElement selectedSearch;
	
	
	WebDriver driver;
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}

	public void searchResultsSelection() {
		
		selectedSearch.click();
		
}

}

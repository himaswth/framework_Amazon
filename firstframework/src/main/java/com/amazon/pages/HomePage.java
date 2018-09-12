package com.amazon.pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage  {
	 WebDriver driver;
	
	@FindBy(how=How.CSS,using="#twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(how=How.CSS,using=".nav-search-submit [type]")
	WebElement searchButton;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 
	}	
	public void searchTab() throws InterruptedException  {
		
	  System.out.println("is this method executing");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 searchBox.sendKeys("laptop");
		 searchButton.click();
			
			
		}
			
}

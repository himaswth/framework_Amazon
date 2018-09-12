package com.amazon.test;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.base.BaseTest;

import com.amazon.pages.HomePage;

import com.amazon.pages.ShippingAddressDetails;



public class HomePageTest extends BaseTest {
	Logger log=LogManager.getLogger(HomePageTest.class);
	HomePage hm ;
	
	 ShippingAddressDetails sa;
	
	
	@Test(priority=2)
	public void SearchTest() throws InterruptedException  {
		
		log.info("HomePage Test starting");
		
		hm=new HomePage(driver);
		hm.searchTab();
		
		System.out.println(driver.getTitle());
	}

	
}

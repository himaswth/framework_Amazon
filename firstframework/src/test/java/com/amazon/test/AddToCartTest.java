package com.amazon.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.base.BaseTest;
import com.amazon.pages.AddToCart;

public class AddToCartTest extends BaseTest {
	
	Logger log=LogManager.getLogger(AddToCartTest.class);
	
	AddToCart at ;
	
	@Test(priority=4)
	public void addToCartTest() throws InterruptedException
	{
		log.info("addToCart Test starting");
		
		at=new AddToCart(driver);
		
		at.addToCart();
		
		
		
	}
}

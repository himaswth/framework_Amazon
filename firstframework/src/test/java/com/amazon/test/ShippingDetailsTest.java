package com.amazon.test;

import org.testng.annotations.Test;

import com.amazon.base.BaseTest;
import com.amazon.pages.ShippingDetails;

public class ShippingDetailsTest extends BaseTest{
	
	ShippingDetails sd;
	
	@Test(priority=5)
	public void shippigDetailsTest() throws InterruptedException {
		sd =new ShippingDetails(driver);
		
		sd.shippingDetails();
		driver.getTitle();
		
	}

}

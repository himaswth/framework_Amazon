package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShippingDetails extends HomePage{
	
	WebDriver driver;
	
	public ShippingDetails(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}


public void shippingDetails() throws InterruptedException {
	
	
	
	WebElement ele3=driver.findElement(By.cssSelector(".ship-to-this-address [data-action]"));
	Thread.sleep(3000);
	ele3.click();
	
	driver.findElement(By.cssSelector("#order_0_ShippingSpeed_sss-us")).click();
	driver.findElement(By.cssSelector("#shippingOptionFormId .a-row:nth-child(6) .sosp-continue-button [type]")).click();
}


}

package com.amazon.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart extends HomePage{

	@FindBy(how=How.CSS,using="#add-to-cart-button[title=\\\"Add to Shopping Cart\\\"]")
	WebElement addToCartButton;
	
	@FindBy(how=How.ID,using="attachSiNoCoverage-announce")
	WebElement noCoverageButton;
	
	@FindBy(how=How.XPATH,using="//span[@id='attach-sidesheet-checkout-button']//input[@type='submit']")
	WebElement proceedToCheckOutButton;	
	
	WebDriver driver;
	
	public AddToCart(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void addToCart() throws InterruptedException {
		
		WebDriverWait wait1 =new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOf(addToCartButton)).click();
		
		Thread.sleep(3000);
		noCoverageButton.click();
		WebDriverWait wait2 =new WebDriverWait(driver,30);
		wait2.until(ExpectedConditions.visibilityOf(proceedToCheckOutButton)).click();
		
		
			
	
	
	
	}
}

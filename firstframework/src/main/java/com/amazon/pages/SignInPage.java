package com.amazon.pages;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.CommonPage;

public class SignInPage extends HomePage{

	
	Logger log= LogManager.getLogger(SignInPage.class);
	
	@FindBy(how=How.CSS,using="#nav-link-accountList")
	WebElement signInButton;
	
	@FindBy(how=How.ID,using="ap_email")
	WebElement emailId;
	
	@FindBy(how=How.XPATH,using="//span[@id='continue']")
	WebElement continueButton;
	
	@FindBy(how=How.ID,using="ap_password")
	WebElement password;
	
	@FindBy(how=How.ID,using="signInSubmit")
	WebElement submitButton;
	
	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void signInDetails() throws InterruptedException {
		
		
		signInButton.click();
		emailId.sendKeys("hima.swth@gmail.com");
		Thread.sleep(1000);
		continueButton.click();
		password.sendKeys("swetha");
		submitButton.click();
		
	}
	
	


}

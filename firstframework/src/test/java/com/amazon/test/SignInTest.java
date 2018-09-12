package com.amazon.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.base.BaseTest;
import com.amazon.pages.SignInPage;

public class SignInTest extends BaseTest {
	
	Logger log=LogManager.getLogger(SignInTest.class);
	SignInPage si;
	
	@Test(priority=1)
	public void signInTest() throws InterruptedException {
		log.info("SignIn Test starting");
		
		si= new SignInPage(driver);
		
		si.signInDetails();
		
	}

}

package com.amazon.base;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.amazon.utils.ConfigUtil;
import com.amazon.utils.WebDriverUtil;




public class BaseTest {
	
	protected static  WebDriver driver;
	public static String browser;
	public static String url;
	
	
	@BeforeSuite
	
	public void beforeSuite() {
	ConfigUtil cu =new ConfigUtil();
	cu.getProperties("config.proprties");
	browser = ConfigUtil.getProperty("browser");
	url =ConfigUtil.getProperty("url");
	System.out.println(browser);
	
	}
	@BeforeTest
	public void beforeTest()  {
		
		
		driver = WebDriverUtil.getDriver1(browser);
		driver.get(url);
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    
		
	}
	
	@AfterClass(enabled=false)
	public void afterClass() {
		driver.quit();
	}

}

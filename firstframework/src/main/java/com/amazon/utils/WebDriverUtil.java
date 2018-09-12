package com.amazon.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {
	
	static Logger log =LogManager.getLogger(WebDriverUtil.class);
	
	public static WebDriver getDriver1(String browserName) {
		
		WebDriver driver=null;
		log.info("In get driver method -browser:"+browserName);
		switch(browserName) {
		
		case "chrome ":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\himas\\eclipse-workspace\\firstframework\\resources\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();	
			break;
			
		default :
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\himas\\eclipse-workspace\\firstframework\\resources\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();	
			
		
		}
		
		
		
		
		
		return driver;
		
	}

	 


}

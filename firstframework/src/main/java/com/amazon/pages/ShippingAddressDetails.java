
package com.amazon.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class ShippingAddressDetails extends HomePage{

	WebDriver driver;
	
	public ShippingAddressDetails(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	public void shippingAddressDetails() throws InterruptedException {
		
		
		
		WebElement ele3=driver.findElement(By.cssSelector(".ship-to-this-address [data-action]"));
		Thread.sleep(3000);
		ele3.click();
		/*
		 WebElement el =driver.findElement(By.id("a-autoid-0-announce"));
		System.out.println(el);
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(el)).click();
		
		driver.findElement(By.cssSelector("[for='order_0_ShippingSpeed_sss-us'] .a-icon-radio")).click();
		driver.findElement(By.cssSelector("span:nth-child(3) .a-button-input")).click();
		driver.findElement(By.xpath("//input[#'enterAddressFullName']")).sendKeys("H Vandanapu");
		driver.findElement(By.cssSelector("#enterAddressAddressLine1")).sendKeys("3680 A Drive");
		driver.findElement(By.cssSelector("#enterAddressAddressLine2")).sendKeys("Apt.No 222");
		driver.findElement(By.cssSelector("#enterAddressCity")).sendKeys("Pleasanton");
		driver.findElement(By.cssSelector("#enterAddressStateOrRegion")).sendKeys("CA");
		driver.findElement(By.cssSelector("#enterAddressPostalCode")).sendKeys("94588");
		WebElement ele1 = driver.findElement(By.cssSelector("#enterAddressCountryCode"));
		Select state =new Select(ele1);
		state.selectByValue("United States");
		driver.findElement(By.cssSelector("#enterAddressPhoneNumber")).sendKeys("9256942949");
		driver.findElement(By.cssSelector("#GateCode")).sendKeys("222");
		driver.findElement(By.xpath("//label[1]/input[@name='isBillingAddress']")).isEnabled();
		driver.findElement(By.name("shipToThisAddress")).click();
	
		*/	
		
	}
	


}

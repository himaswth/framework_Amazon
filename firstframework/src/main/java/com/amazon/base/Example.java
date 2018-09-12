package com.amazon.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\himas\\eclipse-workspace\\firstframework\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("hima.swth@gmail.com");
		driver.findElement(By.cssSelector("#continue[type=\"submit\"]")).click();
		driver.findElement(By.id("ap_password")).sendKeys("swetha");
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.cssSelector(".nav-search-submit [type]")).click();
		
		
		driver.findElement(By.xpath("//li[@id='result_5']//h2[@data-attribute='Acer Aspire E 15, 15.6\" Full HD, 8th Gen Intel Core i3-8130U, 6GB RAM Memory, 1TB HDD, 8X DVD, E5-576-392H']")).click();

		
		System.out.println("add to cart page");
		driver.findElement(By.cssSelector("#add-to-cart-button[title=\"Add to Shopping Cart\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("attachSiNoCoverage-announce")).click();
		WebElement ele2 =driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button']//input[@type='submit']"));
		
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(ele2)).click();
		
		Thread.sleep(3000);
		WebElement ele3=driver.findElement(By.cssSelector(".ship-to-this-address [data-action]"));
		
		ele3.click();
	}

}

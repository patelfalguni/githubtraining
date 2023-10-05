package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_AddProductCart extends BaseClass {
	
	@Test
	public void add() throws InterruptedException {
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Picture of $100 Physical Gift Card']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button-4")).click();
		//String price = driver.findElement(By.xpath("//input[@id='add-to-cart-button-4']/../../..//div")).getText();
		//String price = driver.findElement(By.xpath("//a[text()='$100 Physical Gift Card']/../..//span[text()='100.00']")).getText();
		String price = driver.findElement(By.xpath("//input[@id='add-to-cart-button-4']/../../..//div[@class='prices']")).getText();
		System.out.println(price);
		
	}

}

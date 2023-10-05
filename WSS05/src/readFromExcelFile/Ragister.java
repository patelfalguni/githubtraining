package readFromExcelFile;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ragister {
	
	@Test
	public void ragisterUser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Falguni");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Patel");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("falgunipradip@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("shiva5820");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("shiva5820");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		
		
	}

}

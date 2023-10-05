package readData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.ExcelLibrary;

public class Login {
	@DataProvider
	public String[][] login() throws EncryptedDocumentException, IOException {
		return ExcelLibrary.readAllData("Login");
	}
	
	@Test(dataProviderClass = readData.LoginActitime.class, dataProvider = "data")
	public void loginWithCred(String [] cred) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(cred[1]);
		driver.findElement(By.id("Password")).sendKeys(cred[2]);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.close();
	}

}

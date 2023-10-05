package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Falguni
 *
 */


public class TC_DemoWS_Login {
	public static void main(String[] args) { // test case name loginWithValidCredential
		// Expected Data
		String expectedWelcomePageTitle = "";
		String expectedLoginPageTitle = "login";
		String expectedHomePageTitle = "";

		// Test Data
		String emailId = "sumanth.l@testyantra.com";
		String password = "WebShop";

		// Step 1: Open the browser and enter the test url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		String actualWelcomePageTitle = driver.getTitle();
		if (actualWelcomePageTitle.equalsIgnoreCase(expectedWelcomePageTitle)) {
			System.out.println("Welcome page is displayed");
		} else {
			System.out.println("Welcome page is not displayed");
		}

		// Step 2: Click on Login button
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("Login link is clicked successfully");
		String actualLoginPageTitle = driver.getTitle();
		if (actualLoginPageTitle.equalsIgnoreCase(expectedLoginPageTitle)) {
			System.out.println("Login page is displayed");
		} else {
			System.out.println("Login page is not displayed");
		}

		// Step 3: Enter valid email into email textfield
		driver.findElement(By.id("Email")).sendKeys(emailId);
		String actualEmailEntered = driver.findElement(By.id("email")).getAttribute("value");
		if (actualEmailEntered.equals(emailId)) {
			System.out.println("Email id is entered successfully");
		} else {
			System.out.println("Email id was not entered");
		}

		// Step 4: Enter valid password into password textfield
		driver.findElement(By.id("Password")).sendKeys(password);
		String actualPasswordEntered = driver.findElement(By.id("Password")).getAttribute("value");
		if (actualPasswordEntered.equals(password)) {
			System.out.println("Password is entered successfully");
		} else {
			System.out.println("Password was not entered");
		}
		
		// Step 4: Click on Login button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equalsIgnoreCase(expectedHomePageTitle)) {
			System.out.println("Successfully logged in and home page is displayed");
		}else {
			System.out.println("Login is failed");
		}
	}

}




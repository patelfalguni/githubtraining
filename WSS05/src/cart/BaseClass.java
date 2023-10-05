package cart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import elementRepository.BasePage;
import elementRepository.HomePage;
import elementRepository.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public BasePage basePage ;
	public HomePage homePage ;
	
	@BeforeClass
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		driver = new ChromeDriver(/* options */);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void login() {
		basePage = new BasePage(driver);
		basePage.getLoginLink().click();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmailTextField().sendKeys("sumanth.l@testyantra.com");
		loginPage.getPasswordTextField().sendKeys("WebShop");
		loginPage.getLoginButton().click();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		homePage.getLogoutLink().click();
		Thread.sleep(1500);
	}

	@AfterClass
	public void browserTearDown() {
		driver.quit();
	}



}

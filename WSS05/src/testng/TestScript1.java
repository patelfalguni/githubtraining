package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;



public class TestScript1 {
	
   public static WebDriver driver;
		@Parameters({ "url", "browserName" })
		@Test
		public void readTestData(@Optional("https://www.woodlandworldwide.com/") String url, 
			@Optional("chrome")	String bName) throws InterruptedException {
			Reporter.log("Reading data from xml at the run time", true);
			

			if (bName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (bName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (bName.equals("edge")) {
				System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			} else {
				System.out.println("Browser is invalid");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			Thread.sleep(2000);
			driver.close();
		}
	}




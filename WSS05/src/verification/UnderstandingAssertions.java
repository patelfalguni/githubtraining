package verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UnderstandingAssertions {
	
	@Test
	public void create() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is lunched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.marksandspencer.com/");
		Thread.sleep(2000);
		

		Reporter.log("M&S homepage is opened", true);
		driver.close();


	}

}

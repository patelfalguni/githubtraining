package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_JDSports_04 {
	@Test
	public void OpeningJDSports() {
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is lunched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.jdsports.co.uk/?gclid=CjwKCAjw3oqoBhAjEiwA_UaLtp_TD6urIYFUVdmZGhKAQKFxcQ6O7YyYF8gVfK1ejTHMhx7edFi6-BoCSIsQAvD_BwE&gclsrc=aw.ds/");
		Reporter.log("JDSports homepage is opened", true);


	}

}

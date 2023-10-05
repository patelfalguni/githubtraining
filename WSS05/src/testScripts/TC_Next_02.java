package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Next_02 {
	@Test
	public void OpeningNext() {
			System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Drivers\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			Reporter.log("Browser is lunched", true);
			driver.manage().window().maximize();
			Reporter.log("Browser is maximized", true);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.next.co.uk/");
			driver.findElement(By.xpath("//button[@aria-label='Close cookies section']")).click();
			Reporter.log("Next homepage is opened", true);
			


}
}
	

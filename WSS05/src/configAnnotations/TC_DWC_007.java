package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWC_007 extends BaseClass {
	
	@Test
	public void clickDigitalDownloads() {
		driver.findElement(By.partialLinkText("Digital downloads")).click();

}

}

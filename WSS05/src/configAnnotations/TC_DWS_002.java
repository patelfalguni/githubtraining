package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass {
	
	@Test
	public void clickBooks() {
		driver.findElement(By.partialLinkText("Books")).click();

}

}

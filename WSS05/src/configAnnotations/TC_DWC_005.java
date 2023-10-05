package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWC_005 extends BaseClass {
	
	@Test
	public void clickGiftCards() {
		driver.findElement(By.partialLinkText("Gift Cards")).click();

}

}

package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {

	@Test
	public void clickJewelry() {
		driver.findElement(By.partialLinkText("Jewelry")).click();

}
}

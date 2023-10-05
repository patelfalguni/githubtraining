package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_DWC_006 extends BaseClass {
	
	@Test
	public void clickApparelAndShoes() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();

}

}

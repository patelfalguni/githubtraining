package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(name = "removefromcart") WebElement removeFromCartCheckBox;
	
	private @FindBy(name = "updatecart") WebElement updateCartButton;

	public WebElement getRemoveFromCartCheckBox() {
		return removeFromCartCheckBox;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}


}

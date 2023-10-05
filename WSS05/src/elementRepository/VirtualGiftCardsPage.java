package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualGiftCardsPage {
	
	public VirtualGiftCardsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath = "//input[@value='Add to cart' and @id]")
	WebElement addToCartButton;
	
	private @FindBy(xpath = "//input[contains(@id,'EnteredQuantity')]")
	WebElement quantityTextBox;
	
	private @FindBy(xpath = "//input[contains(@id,'RecipientName')]")
	WebElement recipientsNameTextField;
	
	private @FindBy(xpath = "//input[contains(@id,'RecipientEmail')]")
	WebElement recipientsEmailTextField;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getQuantityTextBox() {
		return quantityTextBox;
	}

	public WebElement getRecipientsNameTextField() {
		return recipientsNameTextField;
	}

	public WebElement getRecipientsEmailTextField() {
		return recipientsEmailTextField;
	}



}

package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath = "//a[contains(text(),'Virtual Gift Card')]/../..//input[@value='Add to cart']")
	WebElement virtualGiftCardsAddToCartButton;

	private @FindBy(linkText = "Log out") WebElement logoutLink;
	
	public WebElement getVirtualGiftCardsAddToCartButton() {
		return virtualGiftCardsAddToCartButton;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}



}

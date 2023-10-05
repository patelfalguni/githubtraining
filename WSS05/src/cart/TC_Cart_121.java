package cart;

import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.ShoppingCartPage;
import elementRepository.VirtualGiftCardsPage;

public class TC_Cart_121 extends BaseClass {
	
	@Test
	public void removeProd() {
		homePage = new HomePage(driver);
		homePage.getVirtualGiftCardsAddToCartButton().click();
		VirtualGiftCardsPage virtualGiftCartPage = new VirtualGiftCardsPage(driver);
		virtualGiftCartPage.getRecipientsNameTextField().sendKeys("Manoj");
		virtualGiftCartPage.getRecipientsEmailTextField().sendKeys("manoj@gmail.com");
		virtualGiftCartPage.getAddToCartButton().click();
		basePage.getShoppingCartLink().click();
		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.getRemoveFromCartCheckBox().click();
		shoppingCartPage.getUpdateCartButton().click();		
	}


}

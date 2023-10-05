package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	private WebElement username;
	
	private WebElement password;
	
	private WebElement liginButton;

	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLiginButton() {
		return liginButton;
	}
	
	

}

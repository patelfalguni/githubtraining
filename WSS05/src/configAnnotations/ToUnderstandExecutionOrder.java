package configAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToUnderstandExecutionOrder {
	
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Opening the browser", true);
		
	}
	@BeforeMethod
	public void loginToApp() {
		Reporter.log("logged in with valid cred", true);
	}
	@AfterMethod
	public void logoutOfApp() {
		Reporter.log("logged out successfully", true);
	}
	
	@AfterClass
	public void browserTeardown() {
		Reporter.log("browser window closed", true);
	}
	@Test
    public void createAccount() {
		Reporter.log("account created successfully", true);
	}
	
	@Test
    public void modifyAccount() {
		Reporter.log("account modified successfully", true);
	}
	
	
}

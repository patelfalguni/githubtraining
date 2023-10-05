package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingMethodFromDiffProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	}

}

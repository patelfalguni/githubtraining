package readData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.ExcelLibrary;

public class LoginActitime {
	

	/*
	 * @DataProvider public String[][] data() throws EncryptedDocumentException,
	 * IOException{ FileInputStream fis = new
	 * FileInputStream("./resources/test.xlsx"); Workbook workbook =
	 * WorkbookFactory.create(fis); int rowNum =
	 * workbook.getSheet("Actitime").getPhysicalNumberOfRows(); int colNum =
	 * workbook.getSheet("Actitime").getRow(0).getPhysicalNumberOfCells();
	 * String[][] arr = new String[rowNum][colNum]; // arr[0][0] =
	 * workbook.getSheet("Actitime").getRow(0).getCell(0).toString(); // arr[0][1] =
	 * workbook.getSheet("Actitime").getRow(0).getCell(1).toString(); // arr[0][2] =
	 * workbook.getSheet("Actitime").getRow(0).getCell(2).toString(); // arr[1][0] =
	 * workbook.getSheet("Actitime").getRow(1).getCell(0).toString(); // arr[1][1] =
	 * workbook.getSheet("Actitime").getRow(1).getCell(1).toString(); // arr[1][2] =
	 * workbook.getSheet("Actitime").getRow(1).getCell(2).toString(); for(int i=0;
	 * i<rowNum; i++) { for(int j=0; j<colNum; j++) { arr[i][j] =
	 * workbook.getSheet("Actitime").getRow(i).getCell(j).toString(); } }
	 * 
	 * return arr; }
	 */
	
	@DataProvider
	public String[][] data() throws EncryptedDocumentException, IOException {
		return ExcelLibrary.readAllData("Sheet1");
	}
	
	@Test(dataProvider = "data")
	public void login(String [] cred) throws InterruptedException {		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(cred[0]);
		driver.findElement(By.id("username")).sendKeys(cred[1]);
		driver.findElement(By.name("pwd")).sendKeys(cred[2]);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		driver.close();
	}
	
	
//	@Test
//	public void login() throws EncryptedDocumentException, IOException {
//		FileInputStream fis = new FileInputStream("./resources/test.xlsx");
//		Workbook workbook = WorkbookFactory.create(fis);
//		Sheet dataSheet = workbook.getSheet("Actitime");
//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get(dataSheet.getRow(0).getCell(0).toString());
//		driver.findElement(By.id("username")).sendKeys(dataSheet.getRow(0).getCell(1).toString());
//		driver.findElement(By.name("pwd")).sendKeys(dataSheet.getRow(0).getCell(2).toString());
//		driver.findElement(By.id("loginButton")).click();
//	}
}




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	  


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1: Create FIS
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		//Step 2 : Create Workbook object
		Workbook workbook = WorkbookFactory.create(fis);

		//Step 3 : read methods
		
		String s1data = workbook.getSheet("Sheet2").getRow(5).getCell(1).getStringCellValue();
		System.out.println(s1data);


	}

}

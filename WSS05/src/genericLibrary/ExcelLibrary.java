package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {
	
	
		
	public static String readFromExcel(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\LSA\\Projects\\WSS05\\data\\TestData.xlsx");
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
	}

	// Step 1: create FIS object
	// Step 2: create Workbook object
	// Step 3: call read methods
	public static String[][] readAllData(String sheet) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\LSA\\Projects\\WSS05\\data\\TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		int rowNum = workbook.getSheet(sheet).getPhysicalNumberOfRows();
		int colNum = workbook.getSheet(sheet).getRow(0).getPhysicalNumberOfCells();
		String[][] arr = new String[rowNum][colNum];
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				arr[i][j] = workbook.getSheet(sheet).getRow(i).getCell(j).toString();
			}
		}
		return arr;
	}



}

package readFromExcelFile;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("log4j2.loggerContextFactory","com.simba.neo4j.shaded.apache.logging.log4j.simple.SimpleLoggerContextFactory");
		//Step 1 : Creating FIS
				FileInputStream fis = new FileInputStream("C:\\LSA\\Projects\\WSS05\\data\\TestData.xlsx");
				
				//Step 2 : Create Workbook object
				Workbook workbook = WorkbookFactory.create(fis);
				
				//Step 3 : read methods
				String s1data = workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				System.out.println(s1data);
			}

		

		
	}



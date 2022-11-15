package Important;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExcelWritingMultipleRowColumn {
	
	
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".\\Data\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Row row = book.getSheet("Sheet1").createRow(2);
		for (int i = 0; i < 10; i++) {
			row.createCell(i).setCellValue('a');
			
		}
		FileOutputStream fos=new FileOutputStream(".\\Data\\Book1.xlsx");
		book.write(fos);
	}
}


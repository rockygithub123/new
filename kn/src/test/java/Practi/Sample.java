package Practi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Sample {
	
@Test(invocationCount = 5)
		
	public void sam()
	{
		Random ran = new Random();
int in=		ran.nextInt(10);
System.out.println(in);
	}
}
	
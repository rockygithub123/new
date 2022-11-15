package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OlympicTest {
	/*
	 * This method or test will fetch all details of olympic athletes
	 */
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{// to launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ch);
		driver.get("https://olympics.com/en/athletes/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// to fetch the name of athlete
		List<WebElement> nameList = driver.findElements(By.xpath("//span[@class='athlete--name']"));
		// to fetch the sure name of athlete
		List<WebElement> sureNameList = driver.findElements(By.xpath("//span[@class='athlete--surname']"));
		// to fetch country name of athlete
		List<WebElement> countryList = driver.findElements(By.xpath("//span[@class='country--name']"));
		// game of athlete
		List<WebElement> gameList = driver.findElements(By.xpath("//span[@class='discipline--name']"));
		// to create path for excel file
		FileInputStream fis =new FileInputStream(".\\Data\\Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		// this loop will fetch and write name,countryName and game of athlete
		for (int i = 0; i < nameList.size(); i++) {

			Row row = sh.createRow(i);
			row.createCell(0).setCellValue(nameList.get(i).getText()+"-"+sureNameList.get(i).getText());
			row.createCell(1).setCellValue(countryList.get(i).getText());
			row.createCell(2).setCellValue(gameList.get(i).getText());

		}
		// to write on Excel book
		FileOutputStream fos=new FileOutputStream(".\\Data\\Book1.xlsx");
		book.write(fos);
		driver.quit();

	}

}

package Practi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice1 {
	/*
	 * this method will fetch the price from amazon and 
	 */
	//@Test
	public static void main(String[]args) throws EncryptedDocumentException, IOException 
	{
		String s="i am king";
		String s1 = s.replaceAll(" ","");
		int len = s1.length()-1;
		String[] arr = s.split(" ");
		
		
	
	 for (int i = 0; i < arr.length; i++) {
		 int lent = arr[i].length();
		 for (int j = 0; j < lent; j++) {
			 System.out.print(s1.charAt(len));
			 len--;
			
		}
		 System.out.print(" ");
		
	}
		
	}

}

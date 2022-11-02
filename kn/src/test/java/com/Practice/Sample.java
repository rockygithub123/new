package com.Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.List;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class Sample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//select[@class=\"gh-sb \"]"));
		ele.click();Thread.sleep(2000);
		Select se = new Select(ele);
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("samsung");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//span[text()='SAMSUNG GALAXY NOTE 10 S10 S20 S21 - FACTORY UNLOCKED GSM/CDMA']")).click();
		
		WebElement buy=driver.findElement(By.id("//a[@id='binBtn_btn']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(buy));
		buy.click();
		List<WebElement> opt = se.getOptions();
		for (WebElement we : opt) {
			//we.click();
			System.out.println(we.getText());
			
			
		}
		driver.quit();
	
	
	
	Thread.sleep(2000);
		
	
	
	
		 
	}
	}

package Practi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1 {
	@Test
	public void test() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nokia 105");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']"));
		WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(ele));
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		
		 for (int i=0;i<4;i++) {
			 Thread.sleep(3000);
			 wait.until(ExpectedConditions.visibilityOf(ele));
			 
		 js.executeScript("window.scrollBy(0,"+y+")");
		 Thread.sleep(3000);
		 try {
			 ele.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 driver.navigate().refresh();
			
		}
		//while(true)
		{
		//ele.click();
		//driver.findElement(By.xpath("//span[@class='s-pagination-item s-pagination-next s-pagination-disabled ']")).click();
	}}



}

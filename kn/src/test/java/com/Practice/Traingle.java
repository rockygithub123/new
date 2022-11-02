package com.Practice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	WebDriverWait wait = new WebDriverWait(driver, 20);
	//wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert();
	driver.findElement(By.xpath("//div[@class=\"IiD88i _351hSN\"]")).sendKeys("7795608985");

	wait.until(ExpectedConditions.alertIsPresent());
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
		
	
	}}

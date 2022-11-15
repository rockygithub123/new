package Practi;

import java.awt.Dimension.*;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator {



	public static  void main(String[]args) 
	{
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc=new Scanner(System.in);
		

		System.out.println("enter the number");
		int x = sc.nextInt();
		double sum=x;
		int flag = 1;
		for (int i = 0; i < flag; i++) 


		{

			System.out.println("enter your mathematical sign(like +,-,*,/...)");
			char ch = sc.next().charAt(0);

			if(ch=='+')
			{
				System.out.println("enter next number");
				int y = sc.nextInt();
				sum=sum+y;
				
				System.out.println("calcualted value is>>>>"+sum);
				System.out.println();
				flag++;
			}
			else if(ch=='-')
			{
				System.out.println("enter your number");
				int z=sc.nextInt();
				sum=sum-z;
				System.out.println("calcualted value is>>>>"+sum);
				System.out.println();
				flag++;
			}
			else if(ch=='*')
			{
				System.out.println("enter your number");
				int a=sc.nextInt();
				sum=a*sum;
				System.out.println("calcualted value is>>>>"+sum);
				System.out.println();
				flag++;
			}
			else if(ch=='/')
			{
				System.out.println("enter your number");
				int z=sc.nextInt();
				sum=sum/z;
				System.out.println("calcualted value is>>>>"+sum);
				System.out.println();
				flag++;
			}
			else if(ch=='=')
			{
				System.out.println("final value is>>>"+sum);
				break;

			}


		}
	}

}

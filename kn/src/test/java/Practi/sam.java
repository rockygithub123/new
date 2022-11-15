package Practi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sam {
	//@Test
	
	public static  void main(String[] args) 
	{
		
		method(10);
		
//		String s="rakesh18";
//		String s1="";
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if(ch>='a'&&ch<='z')
//			{
//				s1=ch+"";
//			}
//			else
//			{
//				s=ch+"";
//			}
//			
//		}
//		
//		System.out.println(s+"&&"+s1);
//		
//		
		
		
//		Driver dri=new Driver();
//		DriverManager.registerDriver(dri);
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
//		
//		for (int i = 0; i < 20; i++) {
//		
//		con.createStatement().executeUpdate("insert into user values(20"+i+",'banglore',123456,'com@g.com','rocky','rocky123','TE','ro')");
//		
//		}
		
	}
	public static void method(int a)
	{
		if(a>0)
		{
			method(a);
			System.out.println(a);
			a--;
		}
	}
}


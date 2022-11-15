package com.Practice;

import java.util.Iterator;

import org.testng.annotations.Test;

public class JavaJavaSelenium {
	@Test
	public void test()
	{
		
		String s="javajavaseleniumjava";
		String s1="java";
		String s2="selenium";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length()+1; j++) {
				if(s.substring(i, j).equals(s1))
				{
					count++;
				}
				
				
				
			}
			
		}
		System.out.println(s1+">>"+count);
	}

}

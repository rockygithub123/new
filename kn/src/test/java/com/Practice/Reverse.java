package com.Practice;

import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Reverse {
	@Test
public void test()
{
	String s="my name is king";
	String[] arr = s.split(" ");
	String s1 = s.replaceAll(" ", "");
	char[] arr1 = s1.toCharArray();
	int len = arr.length-1;
	
	int lenth=arr[len].length();
	
for (int i = arr1.length-1; i >=0 ; i--) {
	char ch = s.charAt(i);
	if(i==lenth)
	{
		System.out.print(" ");
		
		len--;
		System.out.print(ch);
	}
	else
	{
		System.out.print(ch);
	}
}
	
	
	
	}
}

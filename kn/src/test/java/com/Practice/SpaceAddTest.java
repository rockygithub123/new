package com.Practice;

import org.testng.annotations.Test;

public class SpaceAddTest {
	
	
	String s="by the way";
	String s1="bytheway";
	String[] s2 = s.split(" ");

int len=0;
@Test
	public void test()
	{
		
		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s2[i].length(); j++) {
				System.out.print(s1.charAt(len));
				len++;
				
			}
			System.out.print(" ");
			
		}
		
	}

}

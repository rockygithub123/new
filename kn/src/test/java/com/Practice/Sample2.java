package com.Practice;

import org.testng.internal.BaseClassFinder;

public class Sample2 extends  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
		
		for (int i = 2; i < 5; i++) {
			if(no%i==0)
			{
				System.out.println("not a prime");
				break;
				
			}
			else
			{
				System.out.println("yes prime");
				break;
			}
			
		}

	}

}

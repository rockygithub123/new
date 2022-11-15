package com.Practice;

import java.util.Scanner;

public class Sample2   {

	public static void main(String[] args)  {
		String num="";
		System.out.println("enter your num");
		for (int i = 0; i < 10; i++) {
			Scanner sc=new Scanner(System.in);
			try {
				
				int no = sc.nextInt();
				if(no==0&&no==9) {
					
				}
				num=num+no;
				
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Enter valid number");
				i--;
			}
			
		}
		System.out.println(num);
	}}

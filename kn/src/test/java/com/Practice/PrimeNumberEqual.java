package com.Practice;

import java.util.ArrayList;
import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeNumberEqual {
	@Test
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num = sc.nextInt();
		//int num=70;

		//int[] arr=new int[num];
		ArrayList<Integer>arr=new ArrayList<Integer>();
		arr.add(2);
		for (int i = 3; i < num; i++) {
			boolean flag=true;
			for (int j = 2; j < i; j++) {
				if(i%j==0)
				{
					flag=false;
					break;
				}

			}
			if(flag)
			{

				arr.add(i);

			}

		}


		for (int i = 0; i < arr.size(); i++) {
			for (int j = i+1; j < arr.size(); j++) {
				if(arr.get(i)+arr.get(j)==num)

				{
					System.out.println(arr.get(i)+"+"+arr.get(j)+"="+(arr.get(i)+arr.get(j)));
				}



			}

		}

	}
}

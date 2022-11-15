package ArrayPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class BracessTest {
	@Test
	public void test()
	{
		// to get input from user end
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your input");
		String input = sc.next();
		//to convert input into  array type
		char[] ch = input.toCharArray();
		int size = ch.length;
		if(size%2==0)
		{
			int b = size/2;
			int a=b-1;
			for (int i = 0; b < b; i++)
			{

			//to compare a with b
			if(ch[a]==ch[b])
			{
			b++;
			a--;
			
			}
			else
			{
				System.out.println("not balanced");
			}
			}
			System.out.println("balanced");
			
			
		}
		else
		{
			System.out.println("it is unbalanced");
		}
	}

}

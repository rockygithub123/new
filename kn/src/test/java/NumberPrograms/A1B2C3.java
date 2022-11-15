package NumberPrograms;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class A1B2C3 {

	@Test
	
	public  void mmain() throws AWTException, InterruptedException
	{
		String s="a1b2c3";
		char[] a = new char[s.length()] ;
		int[] b=new int[s.length()];
		int count=0;
		int count1=0;
	
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(i%2==0)
				
			{
				a[count]=ch;
				count++;
				
			}
			else if(i%2!=0)
			{
				b[count1]=ch-48;
				count1++;
			}
		}
	for (int i = 0; i < b.length; i++) {
		 int val = b[i];
		 char val1 = a[i];
		// System.out.println(val);
		 for (int j = 0; j <val; j++) 
			
		
		 {
			 System.out.print(val1);
		 }
		// System.out.println();
		
	}
	
	}


}

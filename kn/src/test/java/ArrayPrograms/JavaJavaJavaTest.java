package ArrayPrograms;

import java.util.Iterator;

import org.testng.annotations.Test;

public class JavaJavaJavaTest {
	@Test
	public void test()
	{
		int count=0;
		String s="javajavajavaseleniumjava";
		String s1="java";
		String s2="selenium";
		int count1=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length()+1;j++) {
				if(s.substring(i, j).equalsIgnoreCase(s1))
				{
					count++;
				}
				
				
				else if(s.substring(i, j).equalsIgnoreCase(s2))
				{
					count1++;
				}
				
			}
			
		}
		System.out.println(s1+">>>"+count);
		System.out.println(s2+">>>"+count1);
	}

}

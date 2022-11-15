package Important;

import org.testng.annotations.Test;

public class NumberPalindromeTest {
	@Test
	public void test()
	{
		int sum=0,num=141,no=num;
		
		
		while(no>0)
		{
			int rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
		}
		
		System.out.println(sum);
		
		
		
	}

}

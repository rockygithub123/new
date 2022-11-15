package NumberPrograms;

import org.testng.annotations.Test;

public class SumOfNumberOccuredInOddPlaceInArray {
	@Test
	public void oddUTest()
	{
int sum=0;
		
		int[] a= {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < a.length; i++) {
			if(i%2!=0)
			{
				sum=sum+a[i];
			}
			
		}
		System.out.println("summ of odd placess number in array>>>"+sum);
		
		
	}

}

package NumberPrograms;

import java.awt.AWTException;

public class AddDiognalElementsInArray {
	public static  void main() throws AWTException, InterruptedException
	{
		int sum=0;
		int sum1=0;
		int[][] a= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		for (int j = 0; j < a.length; j++) {
			
			
	
		sum=sum+a[j][j];
		sum1=sum1+a[j][a.length-j-1];
		//System.out.println(a[j][j]);
		//System.out.println(a[j][a.length-j-1]);
		
		}
		System.out.println(sum+">>"+sum1);
		System.out.println(sum-sum1);
	
	}

}

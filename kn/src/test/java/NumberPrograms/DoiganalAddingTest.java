package NumberPrograms;

import java.util.Iterator;

import org.testng.annotations.Test;

public class DoiganalAddingTest {
	@Test
	public void test()
	{ int sum1=0;
	int sum2=0;
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};
		//System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i==j)
				{
					sum1=sum1+a[i][j];
				}
				else if(i==1&&j==1)
				{
					sum2=sum2+a[1][1];
				}
				else if(i==0&&j==a.length-1)
				{
					sum2=sum2+a[0][a.length-1];
				}
				else if(j==0&&i==a.length-1)
				{
					sum2=sum2+a[a.length-1][0];
				}
				
			}
			
			
		}
		System.out.println(sum1-sum2);
		System.out.println(sum1);
		System.out.println(sum2);
	}

}

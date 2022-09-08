package ArrayPrograms;

import java.util.Iterator;

public class ToCheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,5,6,8,9,11,13,18};
		for (int i = 0; i < a.length; i++) {
			int n=a[i];
			int j=2;
			while(true)
			{
				if(n%j==0)
				{
					break;
				}
				else 
				{
					j++;

				}
			}
			if(n==j)
			{
				System.out.print(a[i]+" ");
			}

		}

	}

}

package ArrayPrograms;

import org.testng.annotations.Test;

public class AddFirstThreeMax {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,30,50,20,40};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}

			}
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		int sum=0;
		for (int i = 0; i < 3; i++) {
			sum=sum+a[i];
			
			
		}
	System.out.println("sum of 1st three max is >>>> "+sum);
	}

}

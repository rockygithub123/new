package ArrayPrograms;

public class GetSecondMin {
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
		System.out.println("2nd min is >>> "+a[1]);
		

	}


}

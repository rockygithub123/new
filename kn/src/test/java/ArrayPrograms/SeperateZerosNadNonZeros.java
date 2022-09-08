package ArrayPrograms;

public class SeperateZerosNadNonZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {3,0,0,5,1,0,2};
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				System.out.print(a[i]+" ");
			}
			
			else if(a[i]!=0)
			{
				
				
				
				System.out.print(a[i]);
			}
			
		}

	}

}

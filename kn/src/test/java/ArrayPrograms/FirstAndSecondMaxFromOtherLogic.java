package ArrayPrograms;
-

public class FirstAndSecondMaxFromOtherLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {23,00,50,40,8,26,65,0};
		int fmax=0;
		int smax=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
			
		}
		System.out.println(fmax);
		System.out.println(smax);

	}

}


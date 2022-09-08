package ArrayPrograms;

public class GetSecondMaxByOtherLogic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,50,40};
		int fmax=a[0];//10,20
		int smax=a[0];//10,10
		for (int i = 1; i < a.length; i++) {
			if(fmax<a[i])//10<20
			{
				smax=fmax;//10
				fmax=a[i];//20

			}

		}
		System.out.println(fmax);
		System.out.println(smax);

	}

}

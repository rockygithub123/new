package ArrayPrograms;

public class FirstMaxByOtherLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,50,40};
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println(max);

	}

}

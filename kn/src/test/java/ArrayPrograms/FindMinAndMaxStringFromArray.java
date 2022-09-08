package ArrayPrograms;

public class FindMinAndMaxStringFromArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"hi","rocky","how","are","you"};
		int max=a[0].length();
		int min=a[0].length();
		for (int i = 1; i < a.length; i++) {
			if(max>a[i].length())
			{
				max=a[i].length();
			}
			if(min<a[i].length())
			{
				min=a[i].length();
			}
			
		}
		for (int i = 0; i < a.length; i++) {
		if(a[i].length()==max)	
		{
		
		System.out.println("The least length string is>>"+a[i]);
		}
		if(a[i].length()==min)	
			
			System.out.println("The highest length string is>>"+a[i]);
			}
		

	}

}

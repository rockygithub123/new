package ArrayPrograms;

public class ToFindMaxLenghtStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"hi","rocky","how","are","you"};
		int max=a[0].length();
		for (int i = 1; i < a.length; i++) {
			if(max<a[i].length())
			{
				max=a[i].length();
			}
			
		}
		for (int i = 0; i < a.length; i++) {
		if(a[i].length()==max)	
		
		System.out.println("The least length string is>>"+a[i]);

	}

	}

}

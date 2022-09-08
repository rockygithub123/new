package ArrayPrograms;

import java.util.Iterator;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rocky";//using single variable
		char[]a=str.toCharArray();//using array
		String rev="";
		for (int i = str.length()-1; i > -1; i--) {
			System.out.print(str.charAt(i));
			rev=rev+str.charAt(i);
			
			
		}
		System.out.println(" ");
		
		for (int i = str.length()-1; i > -1; i--) {
			System.out.print(a[i]);
			
			
		}
		System.out.println(" ");
		System.out.println(rev);
		

	}

}

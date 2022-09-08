package ArrayPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class Reverse {
 public static void main(String[] args) {
	//
	 
	 String str = new Scanner(System.in).nextLine();
	 
	
	 String in="INDIA";
	 String rev="";
	 int ln = in.length();
	for (int i = ln-1; i>=0; i--) {
	rev = rev+in.charAt(i);
		
	}
	System.out.println(rev);
	
}
}

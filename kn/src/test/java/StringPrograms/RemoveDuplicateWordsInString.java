package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is is test yantra";
		String [] a=s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (String st :a) {
			set.add(st);
			
		}
		for (String st : set) {
			System.out.print(st+" ");
			
			
		}

	}

}

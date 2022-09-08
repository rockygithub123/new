package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="karnataka";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i <str.length(); i++) {
			if(set.contains(str.charAt(i)))
			{System.out.println("duplicate>>>"+str.charAt(i));}
			set.add(str.charAt(i));
			
		}
		System.out.println(set);

	}

}

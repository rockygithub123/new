package StringPrograms;

import java.util.LinkedHashSet;

public class DuplicateWordInSEntence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="india is great country";
		String[] arr=str.split(" ");
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < arr.length; i++) {
			set.add(str.charAt(i));
		
			
			}
		for (Character ch : set) {
			
			
			int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch)
			{
				count++;
			}
			
		}
		if(count>1)
		{
			System.out.println(ch+" "+count);
		}
		}
			
			

	}

}

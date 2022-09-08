package StringPrograms;

import java.util.LinkedHashSet;

public class ToprintRepetingCharacterAtOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s="aamvkkgg".toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
			
			
		}
		for (Character ch : set) {
			
			for (int i = 0; i < s.length; i++) {
				
				if(ch==s[i])
				{
					System.out.print(s[i]);
				}
				
			}
			
		}

	}

}

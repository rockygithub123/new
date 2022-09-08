package StringPrograms;

import java.util.HashSet;

public class RemoveDuplicatesAndCountOwvels {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="india".toLowerCase();
		int count = 0;
		char[] s=str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
			
		}
		for (Character ch : set) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
			
		}
		System.out.println(count);

	}

}

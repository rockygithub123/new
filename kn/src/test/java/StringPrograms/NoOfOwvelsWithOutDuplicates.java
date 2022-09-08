package StringPrograms;

import java.util.LinkedHashSet;

public class NoOfOwvelsWithOutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="oraaaaaange".toLowerCase();
		int count=0;
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
			
		}
		for( Character ch:set) {
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				
			}
			
		}
		System.out.println("Total owvels count is>>"+count);


	}

}

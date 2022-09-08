package StringPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class OrderOfOccuranceAfterRemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tester";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1));
					break;
				}
				
			}
			
		}
		System.out.println(" remove first duplicates and print last duplicates>>>");
		for (Character ch : set) {
			for (int i = s.length()-1; i >= 0; i--) {
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1));
					break;
				}
				
			}
			
		}

	}

}

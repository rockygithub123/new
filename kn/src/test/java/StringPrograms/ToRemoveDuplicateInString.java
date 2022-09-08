package StringPrograms;

import java.util.Iterator;
import java.util.TreeMap;

public class ToRemoveDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="tester";
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}
			else
			{
				
			}
			
			
		}

	}

}

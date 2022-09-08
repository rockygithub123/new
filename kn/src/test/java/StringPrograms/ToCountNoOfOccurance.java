package StringPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.apache.poi.ss.formula.functions.Count;

public class ToCountNoOfOccurance {


	public static void main(String[] args) {
		count();
		
	}




	public static void count()
	{
		String str="india";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
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
			System.out.println(ch+" "+count);

		}


	}


	public void byMAp() {
		String str="india";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				Integer count = map.get(ch);
				map.put(ch, count+1);


			}


		}System.out.println(map);
		for ( Entry<Character, Integer> mp :map.entrySet()) {
			System.out.println(mp.getKey()+"----"+mp.getValue());

		}

	}

}

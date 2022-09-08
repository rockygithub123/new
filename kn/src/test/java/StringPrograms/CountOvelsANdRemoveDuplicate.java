package StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CountOvelsANdRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ow="aeiou".toCharArray();

		char[] str="oranga".toLowerCase().toCharArray();

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		int count=0;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < ow.length; j++) {
				set.add(str[i]);


				if(str[i]==ow[j])
				{
					count++;
				}
			}

		}
		System.out.println("total vowels in a string is>> "+count);
		System.out.println(set);


	}

}

package StringPrograms;

import java.util.LinkedHashSet;

public class NoOfOccuranceOfWordInSentence {

	public static void main(String[] args) {
		count();
		// TODO Auto-generated method stub

	}
	public static void count()
	{
		String str="wellcome to india to";
		
		String[] arr = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		





		for ( String ch : arr) {
			int count=0;

			for (int i = 0; i < arr.length; i++) {
				if(ch.contains(arr[i]))
				{
					count++;
				}



			}
			System.out.println(ch+" "+count);

		}


	}


}

package StringPrograms;

import java.util.LinkedHashSet;

public class ToCountDuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is is good";
		String [] s=str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (String st : s) {
			set.add(st);

		}
		for (String st : set) {
			int count=0;

			for (int i = 0; i < s.length; i++) {


				if(st.equals(s[i]))
				{

					count++;
				}

			}
			if(count>1)
			{
				System.out.println(st+" count is>>"+count);
			}


		}

	}

}

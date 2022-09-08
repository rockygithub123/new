package StringPrograms;

import java.util.Iterator;

public class ToCountOwvelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ow="aeiou".toCharArray();
		
		char[] str="aaaaa".toLowerCase().toCharArray();
		int count=0;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < ow.length; j++) {
				
			
			if(str[i]==ow[j])
			{
				count++;
			}
			}
			
		}
		System.out.println("total vowels in a string is>> "+count);
		
		
		
		
		
		
		
		//other logic
		String str1="aaa".toLowerCase();
		char[] s=str1.toCharArray();
		int count1=0;
		for (int i = 0; i < str1.length(); i++) {
			if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
			{
				count1++;
			}
			
			
		}
	System.out.println("total vowels is>>>>>>"+count1);
		
		

	}

}

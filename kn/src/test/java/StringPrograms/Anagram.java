package StringPrograms;

import java.util.Arrays;

public class Anagram {
	public void test()
	{
	String s="enginee";
	String s1="enginere";
	char[] s3 = s1.toCharArray();
	char[] s4 = s.toCharArray();
	Arrays.sort(s3);
	Arrays.sort(s4);
	String a = new String(s3);
	String b = new String(s4);
	if(a.equalsIgnoreCase(b))
	{
		System.out.println("anagram");}


	}

}

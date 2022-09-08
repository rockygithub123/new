package StringPrograms;

import java.util.Iterator;

public class UniqCharWithOutCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="india";
		for (int i = 0; i < str.length(); i++) {
			int count=0;
			
			for (int j = 0; j < str.length(); j++) {
				
				if(str.charAt(i)==str.charAt(j)&&i!=j)
				{

					count++;
					break;
				}
				
			}
			if(count==0)
			{
				System.out.println(str.charAt(i)+" ");
			}
			
		}

	}

}

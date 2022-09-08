package ArrayPrograms;

import java.util.Iterator;

public class ToFindMaxAndMinLengthNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a= {"10","222","13","986","2569"};
		String max=a[0];
		for (String st : a) {
			if(st.length()>max.length())
			{
				max=st;
			}
		}
		System.out.println("max lenght num is>>>  "+max+"and length is>>  "+max.length());
			
		}
		
		
	

}

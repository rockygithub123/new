package StringPrograms;

public class RevesreAnyWOrdsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is test yantra";
		String [] s=str.split(" ");
	    String temp=s[0];
	    s[0]=s[s.length-1];
	    s[s.length-1]=temp;
	    for (String s1 : s) {
	    	System.out.print(s1+" ");
			
		}

	}

}

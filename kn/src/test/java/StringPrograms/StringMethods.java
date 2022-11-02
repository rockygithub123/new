package StringPrograms;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1=" hi";
		String s2="hello";
		String s3="welcome";
		String s4="";
		System.out.println(String.join(s2, s1,s3));
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("i"));
		System.out.println(s1+s2+s3);
		System.out.println(s4.isBlank());
		System.out.println(s4.isEmpty());
		System.out.println(s1.replace('h', 'H'));
		
		System.out.println(s1.trim());//it will remove start and end space
		System.out.println(s2.substring(1, 5));//it will fetch from 0-4
		String s5="hi hello bye";
		System.out.println(s5);
		System.out.println(s5.replaceAll(" ",""));
		

	}

}

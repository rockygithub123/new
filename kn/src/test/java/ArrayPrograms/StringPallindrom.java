package ArrayPrograms;

public class StringPallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rar";
		String rev="";
		for (int i =str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
			
		}
		if(rev.equals(str))
		{
		System.out.println("yes it is pallindrome>>>>"+" "+rev);
		}else {System.out.println("not pallindrome");}

	}

}

package StringPrograms;

public class AddNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="as125";
		
		int count=0;
		for (int i = 0; i <s.length(); i++) {
			
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				count=count+(s.charAt(i)-48);
				
			}
			
		}
		System.out.println(count);

	}

}

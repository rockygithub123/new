package StringPrograms;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="test yantra not";
		String[] s=str.split(" ");
		for (int i = s.length-1; i >=0; i--) {
			System.out.print(s[i]+" ");
			
		}

	}

}

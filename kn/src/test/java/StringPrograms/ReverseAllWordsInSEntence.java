package StringPrograms;

public class ReverseAllWordsInSEntence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="test yantra not";
		String[] s=str.split(" ");
		//System.out.println("reference>>>"+str);
		for (int i = 0; i <s.length; i++)
		{
			String str1=s[i];

			for (int j = str1.length()-1; j>=0; j--)
			{
				System.out.print(str1.charAt(j));

			}
			System.out.print(" ");
		}

	}

}

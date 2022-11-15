package NumberPrograms;

import org.testng.annotations.Test;

public class ReverseWordAndCharacterTest {
	@Test
	void test()
	{
		String s="doog ton ma";
		String[] ar = s.split(" ");
		for (int i = ar.length-1; i >=0 ; i--) {
			String val = ar[i];
			for (int j = val.length()-1; j >=0; j--) {
				System.out.print(val.charAt(j));
				
			}
			System.out.print(" ");
	}

}
}

package Patternbs;

public class Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				//System.out.print("*  ");

			}
			//System.out.println("");

		}
		//pattern();
		pattern1();
	}

	static void pattern()
	{
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*  ");

			}
			System.out.println("");

		}


	}
	static void pattern1()
	{
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {


				System.out.println("* ");
			}

		}


	}



}

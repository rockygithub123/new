package Patternbs;

public class Doimend {

	public static void main(String[] args) {
		int n=3;
		// TODO Auto-generated method stub
		for (int i = 0; i <=n; i++) {
			for (int j = i; j <=n; j++) {
				System.out.print("  ");

			}
			for (int j = 1; j <i; j++) {
				System.out.print("* ");

			}
			for (int j = 1; j <=i; j++) {


				System.out.print("* ");

			}
			System.out.println();


		}
		for (int i = 0; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("  ");

			}
			for (int j = i; j <n; j++) {
				System.out.print("* ");

			}
			for (int j = i; j <=n; j++) {


				System.out.print("* ");

			}
			System.out.println();

		}


	}

}

package Patternbs;

public class ArrowWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i = 0; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}
		for (int i = 0; i <=n; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}

	}

}

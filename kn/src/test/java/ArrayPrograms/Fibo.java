package ArrayPrograms;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		int c=0;
		while (c<10)
		{
			c=a+b;
			a=b;
			b=c;
			if(c<10) {
			System.out.println(c);
			}
		}
			
		}

		
		

	}



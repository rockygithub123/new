
package ArrayPrograms;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-5,1,2,4,6,7,9,25};
		for (int i = 0; i <a.length-1; i++) {
			int n=a[i+1]-a[i];
			int count=1;
			while(n>1)
			{
				System.out.print(a[i]+count+" ");
				count++;
				n--;
			}
			
				
			}
			
			
		}

	}



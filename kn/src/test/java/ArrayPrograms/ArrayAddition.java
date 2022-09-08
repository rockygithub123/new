package ArrayPrograms;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,6,8};
		int[] b= {1,2,3,4,5,6,5};
		int length=a.length;
		if(a.length<b.length)
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
		{
			try {
				System.out.println(a[i]+b[i]);
			} catch (Exception e) {
				if(a.length<b.length)
				{
					System.out.println(b[i]);
				}
				else 
				{
					System.out.println(a[i]);
				}

			}





		}}}




/*
		int c=a.length;
		int d=b.length;
		if(c>=d)
		{
			for (int i = 0; i < c; i++) {
				if(i<d) {
				for (int j = 0; j < d; j++) {
					System.out.println(a[j]+b[j]+" ");

				}}
				else
				{
				System.out.println(a[i]);
				}


			}
		}
		else 
		{
			for (int i = 0; i < d; i++) {
				if(i<c) {
				for (int j = 0; j < c; j++) {
					System.out.println(a[j]+b[j]+" ");

				}}
				else
				{
				System.out.println(b[i]);
				}


		}

	}

	}}*/

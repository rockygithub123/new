package ArrayPrograms;

import java.util.LinkedHashSet;

public class AssignmentOnArray {
	int[] a= {4,6,8,5,9,8,4};

	public static void main(String[] args) {
		System.out.println("4,6,8,5,9,8,4");
		//removeDuplicate();
	    //repeatingNumber();
		//noOfDuplicates();
		//uniqueNumber();
		orderOfOccurance();


	}
	public static void removeDuplicate()
	{
		int[] a= {4,6,8,5,9,8,4};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);

		}
		System.out.println(set);}
	public static void repeatingNumber()
	{
		int[] a= {4,6,8,5,9,8,4};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);

		}
		for (Integer in : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(in==a[i])
				{
					count++;
				}


			}
			System.out.println(in+"count is>>>"+count);

		}
	}
	public static void noOfDuplicates()
	{

		int[] a= {4,6,8,5,9,8,4};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);

		}
		for (Integer in : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(in==a[i])
				{
					count++;
				}


			}
			if(count>=2)
			{
				System.out.println(in+" is duplicate and count is>>>"+count);
			}

		}


	}
	public static void uniqueNumber()
	{
		int[] a= {4,6,8,5,9,8,4};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);

		}
		for (Integer in : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(in==a[i])
				{
					count++;
				}


			}
			if(count<2)
			{
				System.out.println(in+" is unique>>>"+count);
			}

		}

	}
	public static void orderOfOccurance()
	{
		int[] a= {4,6,8,5,9,8,4};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);

		}
		for (Integer in : set) {
			//System.out.println(in);
			for (int i = 0; i < a.length; i++) {
				if(in==a[i])
				{
					System.out.println(in+"order of occurance is>>"+(i+1));
					break;
					
				}

			}

		}

	}


}





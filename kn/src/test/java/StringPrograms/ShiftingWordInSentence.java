package StringPrograms;

public class ShiftingWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr="bangalore is city".split(" ");
		
		int key = 1;
		for (int i = 0; i < key; i++) {
			String temp=arr[i];
			for (int j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
				
			}
			arr[arr.length-1]=temp;
			
			
			
		}
		for (String s : arr) {
			System.out.print(s+" ");
			
		}
		

	}

}

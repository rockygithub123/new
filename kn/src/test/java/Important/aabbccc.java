package Important;

import org.testng.annotations.Test;

public class aabbccc {
	@Test
	public void test() 
	{     String s="aaabbbcccaa";
	  int count=0;
	  char ch = s.charAt(0);
	  
      for (int i = 0; i < s.length(); i++) {
    	
    	 
    	  char ch1 = s.charAt(i);
    	
    	  
    	  
    	   if(i+1==s.length())
    	  {
    		  System.out.println(ch+">>"+(count+1));
    	  }
    	   else if(ch==ch1)
    	  {
    		  count++;
    	  }
    	  
    	  else 
    	  {
    		  System.out.println(ch+">>>"+count);
    		  ch=ch1;
    		  System.out.println();
    		  count=1;
    	  }
		
	}

	}}

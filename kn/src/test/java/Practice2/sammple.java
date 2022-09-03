package Practice2;

import org.testng.annotations.Test;

public class sammple {
	public void ok()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void ok(String x)
	{
		int a=10;
		int b=20;
		int c=a+b-b;
		System.out.println(c);
	}
	public void ok(int d)
	{
		int a=10;
		int b=20;
		int c=a+b-a;
		System.out.println(c);
	}

}
class xyz
{
	@Test
	public void sam(){
		sammple s=new sammple();
		s.ok();
		s.ok(20);
		s.ok("k");
	}
	}

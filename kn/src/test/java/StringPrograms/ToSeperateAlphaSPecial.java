package StringPrograms;

public class ToSeperateAlphaSPecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Arak#$$2351";
		String uppercase="";
		String lowercase="";
		String num="";
		String spe="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>64&&ch<91)
			{
				
				uppercase=uppercase+ch;
			}
			else if(ch>96&&ch<123)
			{
				lowercase=lowercase+ch;
			}
			else if(ch>47&&ch<59)
				
			{
				num=num+ch;
			}
			else
			{
				spe=spe+ch;
			}
			
		}
		System.out.println("Total uppercase is is           >>> "+uppercase);
		System.out.println("Total uppercase is is           >>> "+lowercase);
		System.out.println("Total number is                 >>> "+num);
		System.out.println("Total special charactyer  is    >>> "+spe);

	}

}

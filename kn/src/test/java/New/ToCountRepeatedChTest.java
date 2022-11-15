package New;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ToCountRepeatedChTest {
	Map<Character, Integer> map=new HashMap<Character, Integer>();
	@Test()
	public void tableTest()
	{
String s="aannccdddd";
for (int i = 0; i < s.length(); i++) {
	char ch = s.charAt(i);
	if(!map.containsKey(ch))
	{
		map.put(ch, 1);
	}
	else
	{
		Integer val = map.get(ch);
		map.put(ch, val+1);
	}
}
	for ( Entry<Character, Integer> es :map.entrySet()) {
		System.out.println(es.getKey()+">>"+es.getValue());
		
	}					
}}

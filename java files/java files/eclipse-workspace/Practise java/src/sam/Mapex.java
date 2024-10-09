package sam;

import java.util.TreeMap;
import java.util.Map;

public class Mapex {
public static void main(String[] args)
	
	{
Map<Integer,String> map=new TreeMap<Integer,String>();//replace TreeHash by HashMap and see output
map.put(105,"Sanjay");
map.put(102,"Shah");
map.put(103,"sam");
map.put(104,"Vedar");
map.get(104);
System.out.println(map);
for(Map.Entry<Integer,String> m:map.entrySet()) {
	//System.out.println(m.getKey()+"The value is: "+m.getValue());
	Integer n=m.getKey();
	String s=m.getValue();
	System.out.println(n+" name: "+s);
	
}
System.out.println(map.get(104));
	}
}

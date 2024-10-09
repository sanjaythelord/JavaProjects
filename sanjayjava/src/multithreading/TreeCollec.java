package multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeCollec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(101, "Smriti");
		map.put(102,"Afsal");
		map.put(90, "Aadya");
		System.out.println(map);
		
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry e=(Entry) itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}	
	}
}

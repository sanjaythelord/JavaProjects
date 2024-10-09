package CollectionFramework;
//Map.Entry interface in Java provides certain methods to access 
//the entry in the Map. By gaining access to the entry of the Map 
//we can easily manipulate them. Map. 
//Entry is a generic and is defined in the java.

//Map. entrySet() method in Java is used to create a set out of the
//same elements contained in the map.

//here map is an interface
//and hashmap is a class
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Yoda");
		map.put(2, "Darth");
		map.put(3, "Luke");
		map.put(4, "Han");
		map.put(5, "Leia");
		map.put(6, "Leia");
		System.out.println(map);

		 for(Map.Entry m:map.entrySet()) {
		  System.out.println(m.getKey()+" "+m.getValue()); }
		 
	}

}

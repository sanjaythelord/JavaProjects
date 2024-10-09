package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();          
	    map.put(10,"Vedar");    
	    map.put(11,"Luke");    
	    map.put(12,"Ray");
	    //returns a set view of the mappings contained in map
	    map.entrySet();
	    //returns a sequential stream with the collection as its source
	    //  .stream();
	    

	}

	

}

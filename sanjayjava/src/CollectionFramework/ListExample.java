package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		//creating a list of type string
		List<String> list = new ArrayList<String>();
		//adding elements to the list
		list.add("Java");
		list.add("Java");
		list.add("Python");
		list.add("Dot Net");
		list.add("JavaScript");
		
		//iterating the list elements using for-each loop
		System.out.println("Courses available are:");
		for(String course : list) {
			System.out.println(course);
		}
		
		//retrieving elements from list
		System.out.println("Get element: "+list.get(2));

	}

}

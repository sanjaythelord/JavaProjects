package pakage09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExample {

	public void CallingSet(Set<String> s) {
		for(String name:s) {
			System.out.println(name);
		}
	}
	
	public List CallingList(Set<String> s) {
		ArrayList<String> al = new ArrayList<String>();
		for(String name:s) {
			System.out.println(al.addAll(s));
		}
		System.out.println("List value:");
		
		  for(String name:al) {
			  System.out.println(name); 
			  }
		 
		return al;
		
	}
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		s.add("Sanjay");
		s.add("Yoda");
		s.add("Darth");
		s.add("Luke");
		s.add("Vedar");
		
		CollectionExample ce = new CollectionExample();
		ce.CallingSet(s);
		ce.CallingList(s);
		
		

	}

}

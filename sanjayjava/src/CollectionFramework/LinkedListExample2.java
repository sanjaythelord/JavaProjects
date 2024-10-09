package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ram");  
		  al.add("Vijay");
		  al.add("Alex");
		  al.add("Ramesh");  
		  al.add("Ajay");  
		  
		  //An Iterator is an object that can be used to loop through collections, 
		  //like ArrayList and HashSet. It is called an "iterator" because
		  //"iterating" is the technical term for looping.
		  Iterator<String> itr=al.iterator();  
		  //itr.next();
		  //System.out.println(itr.next());
		  //itr.next();
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

	}

}

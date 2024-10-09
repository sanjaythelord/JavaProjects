package pkg2;

import java.util.ArrayList;
import java.util.List;

public class List1 {
   //ArrayList
	void emps() {
		ArrayList al = new ArrayList();
		al.add("Anish");
		al.add("Sanjay");
		al.add("Sanju");
		al.add(200);
		al.add(21.0235);
		
		
		  for(Object ob:al) { 
			  System.out.println(ob); 
			  }	 
	}
	
	ArrayList emp2() {
		ArrayList al = new ArrayList();
		al.add("Darth");
		al.add("vedar");
		al.add(007);
		al.add(200);
		al.add(21.0235);
		return al;
	}
	// list type method has Arraylist type object.
	List emp3() {
		List al = new ArrayList();
		al.add("Darth");
		al.add(007);
		return al;
	}

	public static void main(String[] args) {
		List1 l = new List1();
		l.emps();
		ArrayList ls = l.emp2();
		System.out.println("Size of array list is: "+ls.size());
		//for (datatype variable : array/arraylist)
		for(Object s:ls) {
			System.out.println(s);
		}
		
		List lss  = l.emp3();
		for(Object l3 : lss) {
			System.out.println("list three ..."+l3);
		}
	     
	}
}

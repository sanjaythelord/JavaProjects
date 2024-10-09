package multithreading;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeInterface {
	void display(TreeSet<String> t) {
		for(String s:t) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeInterface ti=new TreeInterface();
		TreeSet<String> t=new TreeSet<String>();
		t.add("Java");
		t.add("Python");
		t.add("C");
		t.add("Java");
		System.out.println(t);
		System.out.println("Size of the set is: "+t.size());
		ti.display(t);
		
		TreeSet<String> tree=new TreeSet<String>();
		tree.add("Smriti");
		tree.add("Lucky");
		tree.add("Anu");
	}
}

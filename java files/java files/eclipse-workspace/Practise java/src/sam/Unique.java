package sam;

import java.util.*;

public class Unique {
	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();//set implementing class is hashset
		s.add("A");
		s.add("A");
		s.add("B");
		System.out.println(s);
	}
}		

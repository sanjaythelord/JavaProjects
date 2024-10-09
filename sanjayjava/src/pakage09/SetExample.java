package pakage09;

import java.util.HashSet;
import java.util.Set;
//non repeated data
public class SetExample {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Sanjay");
		s.add("Sanjay");
		s.add("Darth");
		s.add("darth");
		s.add("Vedar");
	
	
	for(String name:s) {
		System.out.println(name);
	}

}
}

package pakage09;

import java.util.ArrayList;

//collection framework
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(23);
		l.add(24);
		l.add(25);
		l.add(26);
		l.add(27);

		//for each loop
	for(Integer num : l) {
		System.out.println(num);
	}
	}
}

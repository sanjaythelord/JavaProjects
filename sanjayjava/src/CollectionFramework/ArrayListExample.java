package CollectionFramework;

import java.util.ArrayList;
//Java ArrayList class uses a dynamic array for storing the elements. 
//It is like an array, but there is no size limit. 
//We can add or remove elements anytime. 
//So, it is much more flexible than the traditional array. 
//It is found in the java.util package.

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(23);
		l.add(24);
		l.add(25);
		l.add(26);
		l.add(27);
		l.add(28);

		//for each loop
	for(Integer num : l) {
		System.out.println(num);
	}
	}
}

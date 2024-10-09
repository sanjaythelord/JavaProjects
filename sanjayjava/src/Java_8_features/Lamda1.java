package Java_8_features;

import java.util.ArrayList;

public class Lamda1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
		/*Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. 
		 * Lambda expressions are similar to methods, 
		 * but they do not need a name and they can be implemented right in the body of a method.*/
	}

}

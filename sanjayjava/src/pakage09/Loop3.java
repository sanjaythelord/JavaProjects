package pakage09;

import java.util.ArrayList;
import java.util.List;

public class Loop3 {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		int array[]= {4,5,6,7};
		
		//normal for loop for adding elements
		for(int i=1;i<10;i++) {
			values.add(i);
		}
		// normal for loop to print value from array
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]+" ");
		}
		System.out.println();
		
		//enhanced for loop for printing list
		for(int i:values) {
			System.out.print(i+" ");
		}
		System.out.println();
		//enhanced for loop for printing array
		for(Integer j:array) {
			System.out.println(j);
		}
		 
		System.out.println("using forEach");
		//using foreach loop
		values.forEach(System.out::println);
		
		//difference between enhanced for loop and forEach loop
		//A for loop is a control flow structure used for iteration that allows 
		//code to be repeatedly executed.
		

	}

}

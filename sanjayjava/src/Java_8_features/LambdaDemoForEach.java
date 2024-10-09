package Java_8_features;

import java.util.Arrays;
import java.util.List;

public class LambdaDemoForEach {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(2,6,3,1,8,9);
		/*
		 * The asList() method of java.util.Arrays class is used to return a fixed-size
		 * list backed by the specified array. This method acts as a bridge between
		 * array-based and collection-based APIs, in combination with
		 * Collection.toArray(). The returned list is serializable and implements
		 * RandomAccess.
		 */
		
		  for(int i=0;i<values.size();i++) {
			  System.out.println(values.get(i)); 
			  }
		  
		  for(int i:values) {
			  System.out.println(i); 
			  }
		 
		System.out.println("Lambda Expression");
		values.forEach(i->System.out.println(i));//lambda
	}

}

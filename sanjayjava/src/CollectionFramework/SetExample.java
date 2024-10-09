package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

// set is an interface in java.
// the set interface uses collection interface method to 
// avoid the insertion of the same elements
// it is used to create the mathematical set.

public class SetExample {

	public static void main(String[] args) {
		// Demonstrating Set using HashSet
        // Declaring object of type String
        Set<String> hash_Set = new HashSet<String>();
		
 
        // Adding elements to the Set
        // using add() method
        hash_Set.add("I");
        hash_Set.add("I");
		hash_Set.add("am");
		hash_Set.add("a"); 
		hash_Set.add("Java");
	    hash_Set.add("Developer");
		 
 
        // Printing elements of HashSet object
        System.out.println(hash_Set);
        // Hash set does not maintain any order.
        //if we try to add a duplicate element in hashset 
        // the old value will be overwritten.
        // if we want to preserve the order we need to use linkedlist
	}
}

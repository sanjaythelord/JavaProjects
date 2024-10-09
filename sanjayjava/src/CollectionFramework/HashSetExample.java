package CollectionFramework;
//Java HashSet class is used to create a collection that uses a hash table for storage. 
//HashSet stores the elements by using a mechanism called hashing.
//HashSet contains unique elements only.
//HashSet doesn't maintain the insertion order. 
//Here, elements are inserted on the basis of their hashcode.
import java.util.HashSet;

class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(40);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(-5);
        numbers.add(45);
        numbers.add(0);
        System.out.println("New HashSet: " + numbers);
    }
}

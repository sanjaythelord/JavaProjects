package CollectionFramework;
//Java LinkedList class uses a doubly linked list to store the elements. 
//It provides a linked-list data structure.
//Java LinkedList class can contain duplicate elements.
//Java LinkedList class maintains insertion order.
import java.util.LinkedList;
import java.util.Queue;

//java program to demonstrate the creation of queue
//objects using the LinkedList Class
public class LinkedListExample {	
	public static void main(String[] args) {
		//creating an empty LinkedList
		//Queue<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		// List<Integer> list = new LinkedList<Integer>();// if we define this peek method is not executed
		
		//adding items to list
		list.add(12);
		list.add(18);
		list.add(20);
		list.add(16);
		list.add(16);
		
		//displaying the top element of the LinkedList
		System.out.println("Top element of the LinkedList is: "+list.peek());
		System.out.println(list);
		//displaying the top element and removing it
		System.out.println("Displaying and removing top element from LinkedList: "+list.poll());
		System.out.println(list);
		
		System.out.println("displaying top element again as: "+list.peek());
		
	}

}

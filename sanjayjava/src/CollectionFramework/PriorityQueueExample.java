package CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String args[]) {
		Queue<String> pq = new PriorityQueue<>();
		pq.add("Coding");
		pq.add("Technology");
		pq.add("BalKumari");
		pq.add("CCRC");
		
		pq.remove("CCRC");
		
		System.out.println("Displaying the queue");
		
		System.out.println(pq);
		
		System.out.println("\nFor iterating the elements to a queue");
		
		Iterator iterator = pq.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
	}
	
}

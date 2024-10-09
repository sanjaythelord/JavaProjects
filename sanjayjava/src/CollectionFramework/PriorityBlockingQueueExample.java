package CollectionFramework;

import java.util.concurrent.PriorityBlockingQueue;

//The PriorityBlockingQueue is an unbounded blocking queue that uses the
//same ordering rules as class PriorityQueue and supplies
//blocking retrieval operations. Since it is unbounded, adding elements
//may sometimes fail due to resource exhaustion resulting
//in OutOfMemoryError.

public class PriorityBlockingQueueExample {

	public static void main(String[] args) {
		// create object of PriorityBlockingQueue
        // using PriorityBlockingQueue() constructor
        PriorityBlockingQueue<Integer> pbq
            = new PriorityBlockingQueue<Integer>();
  
        // add  numbers
        pbq.add(1);
        pbq.add(2);
        pbq.add(3);
        pbq.add(4);
        pbq.add(5);
  
        // print queue
        System.out.println("PriorityBlockingQueue:" + pbq);

	}

}

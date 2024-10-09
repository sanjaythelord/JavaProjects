package sam;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queueexample {
public static void main(String[] args) {
	Queue<String> Q=new PriorityQueue<String>();
	Q.add("Amit");
	Q.add("Binod");
	Q.add("Chinmaya");
	Q.add("Deepak");
	Q.add("Elle");
	Q.add("Firdosh");
	System.out.println(Q);
	Q.poll();
	System.out.println(Q);
	Q.poll();
	System.out.println(Q);//insertion order is not maintained as list
	Q.poll();
	System.out.println(Q);
	Q.poll();
	System.out.println(Q);
}
}

package pkg2;

public class ThreadExample extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}
}

//  the output that the 3 threads do not run in any particular sequence
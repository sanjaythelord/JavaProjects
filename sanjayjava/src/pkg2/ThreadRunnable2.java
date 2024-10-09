package pkg2;

public class ThreadRunnable2 {

	// The Runnable interface marks an object
	// that can be run as a thread.
	
	public static void main(String[] args) {
		Runnable r = new ThreadRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}

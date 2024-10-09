package pkg2;

public class ThreadExample2 {
		public static void main(String[] args) {
			Thread t1 = new ThreadExample();
			Thread t2 = new ThreadExample();
			Thread t3 = new ThreadExample();
			t1.start();
			t2.start();
			t3.start();

		}
	}
	
// the output that the 3 threads do not run in any particular sequence

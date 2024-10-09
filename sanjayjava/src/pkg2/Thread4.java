package pkg2;

public class Thread4 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread has ended");
		
	}
	
	public static void main(String[] args) {
		Thread4 t = new Thread4();
		Thread t1 = new Thread(t);
	    t1.start();
		System.out.println("Hello");
	}

}

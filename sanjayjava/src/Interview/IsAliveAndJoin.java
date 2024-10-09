package Interview;

//Java program to Illustrate isAlive() Method
//of Thread class
public class IsAliveAndJoin extends Thread {

	public void run() {
		System.out.println("Hello");
		
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("World");
	}
	
	public static void main(String[] args) {
		IsAliveAndJoin t = new IsAliveAndJoin();
		IsAliveAndJoin t1 = new IsAliveAndJoin();
		t.start();
		t1.start();
		// Checking whether thread is alive or not
        // Returning boolean true if alive else false
		System.out.println(t.isAlive());
		System.out.println(t1.isAlive());
	}
}

package pkg2;

public class Thread5 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
	        System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
	        }
	}
	public static void main(String[] args) {
		
		Thread object = new Thread();
       
           System.out.println("Main Thread id: " + Thread.currentThread().getId());
           object.start();  
	}
	
}

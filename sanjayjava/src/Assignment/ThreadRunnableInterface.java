package Assignment;

public class ThreadRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello");
		
	}
	
	public static void main(String[] args) {
		ThreadRunnableInterface t2 = new ThreadRunnableInterface();
		Thread t = new Thread(t2);
		ThreadRunnableInterface t1 = new ThreadRunnableInterface();
		Thread th = new Thread(t1);
		th.start();
		t.start();

	}

	

}

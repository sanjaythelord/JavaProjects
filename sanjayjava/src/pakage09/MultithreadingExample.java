package pakage09;

public class MultithreadingExample extends Thread {
//1. we can create thread by extending Thread class
	//2. or by implementing runnable interface.
	public void run() {
		//logic is written inside it.
		System.out.println("This is run method.");
		for(int i=0;i<3;i++) {
			System.out.println("Name: "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		MultithreadingExample m = new MultithreadingExample();
		m.start();
		MultithreadingExample m1 = new MultithreadingExample();
		m1.start();
		MultithreadingExample m2 = new MultithreadingExample();
		m2.start();

	}

}

package pakage09;

public class TestSynchronize {

	public static void main(String[] args) {
		
		//final SynchronizationExample sy = new SynchronizationExample();
		SynchronizationExample sy = new SynchronizationExample();
		//only one object
		Thread t1 = new Thread() {
			public void run() {
				sy.printTable(4);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				sy.printTable(6);
			}
		};
		t1.start();
		t2.start();
	}

}

package pkg2;

public class Thread1 extends Thread {
	public void run() {
		System.out.println("This is Thread1.");
	}
	public static void main(String[] args) {
		Thread1 th = new Thread1();
		th.start();
	}
}
//change method name run
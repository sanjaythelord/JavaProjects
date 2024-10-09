package pkg2;

public class Sync2 extends Thread {
	public void run() {
		Sync.msg("sanjay");//static method is directly called through class name
	}
	public static void main(String[] args) {
		Sync2 s = new Sync2();
		Sync1 sy = new Sync1();
		Sync3 ss = new Sync3();
		s.start();
		
	}
}

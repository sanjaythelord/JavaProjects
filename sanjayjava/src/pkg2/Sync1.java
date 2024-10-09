package pkg2;

public class Sync1 extends Thread{
	public void run() {
		Sync.msg("sanjay");//static method is directly called through class name
	}

	public static void main(String[] args) {
		
	}
}

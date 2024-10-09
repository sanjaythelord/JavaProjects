package pakage09;

public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		Sync sy = new Sync();
		ta.start();
		tb.start();
		Sync.msg("Luke");
	}
}

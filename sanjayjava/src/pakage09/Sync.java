package pakage09;

public class Sync {
	static void msg(String name) throws InterruptedException {
		for(int i=0;i<3;i++) {
			System.out.println("Hi "+name);
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Sync s = new Sync();
		s.msg("Vedar");
	}
}

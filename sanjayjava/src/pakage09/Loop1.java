package pakage09;

public class Loop1 {
	
	//while loop
	void myLoop() {
		int x=1;
		while(x<10) {
			System.out.println("x is:"+x);
			x++;
		}
	}
	//for loop
	void myFor() {
			for(int i=0; i<=10;i++) {
				System.out.println("Value of i is:"+i);
			}
			for(int i=10; i>=1;i--) {
				System.out.println("Value of i is:"+i);
			}			
	}
	
	public static void main(String[] args) {
		Loop1 l = new Loop1();
		l.myLoop();
		l.myFor();
		
	}
}

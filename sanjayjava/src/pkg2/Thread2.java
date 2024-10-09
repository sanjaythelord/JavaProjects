package pkg2;

public class Thread2 extends Thread {
	public void run() {
		
		/* System.out.println("Calling other methods using thread."); */
		for(int i=0;i<10;i++) {
			//interrupted exception occurs when for loop is halt for defined seconds
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.info("Vedar");
		this.sum(12, 12);
	}
	public void info(String name){
		System.out.println("I am "+name);
	}
	public void sum(int a,int b) {
		int c = a+b;
		System.out.println("Sum is: "+c);
	}
	public static void main(String[] args) {
		Thread2 th = new Thread2();
		th.start();
	}
}


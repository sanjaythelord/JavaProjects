package ThirdSem;

public class Thread3 extends Thread{
	public void run() {
		System.out.println("This is Thread3.");
		for(int i=0;i<4;i++) {
			//interrupted exception occurs when for loop is halt for defined seconds
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		Thread.currentThread().setPriority(8);
		int p = Thread.currentThread().getPriority();
		System.out.println("Priority of thread is: "+p);
		String name = Thread.currentThread().getName();
		System.out.println("Name of the thread is: "+name);
	}
	public static void main(String[] args) {
		Thread3 th = new Thread3();
		th.start();
	}
	
}

package pkg2;

public class Police extends Thread {
	public void run()//this method is mandatory as we call p.start()
	{
		for(int i=0;i<3;i++) {
		System.out.println("Thread"+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		//implementation multiple thread by creating different objects
		Police p = new Police();
		Police p1 = new Police();
		Police p2 = new Police();
		Police p3 = new Police();
		p.start();//to start threading process
		
		p1.start(); p2.start(); p3.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		 
	}
}

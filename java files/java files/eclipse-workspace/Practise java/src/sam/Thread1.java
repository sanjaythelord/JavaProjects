package sam;

public class Thread1 extends Thread {
	public void run()
	{
		for(int i=0;i<4;i++) {
			System.out.println("Thread1 is:"+Thread.currentThread().getName());
	}
		this.method();//function calling function
	}
	public void method() {
		System.out.println("The method of the first class is running");
	}
	
	public class Thread2 extends Thread {
		public void run()
		{
			for(int i=0;i<3;i++) {
				System.out.println("Thread2 is:"+Thread.currentThread().getName());
			}
		}

}
	public static void main(String[] args) {
		Thread1 t=new Thread1();
//		Thread1 t1=new Thread1();
//		Thread1 t2=new Thread1();
//		Thread1 t3=new Thread1();
		t.start();
//		t1.start();
//		t2.start();
//		t3.start();
		for(int i=0;i<2;i++)
		{
			System.out.println("Main is:"+Thread.currentThread().getName());
		}
	}
}

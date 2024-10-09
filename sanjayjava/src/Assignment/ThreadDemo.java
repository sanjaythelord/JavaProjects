package Assignment;

public class ThreadDemo extends Thread {
	public void run()
	{
		System.out.println("Some Thread id: "+Thread.currentThread().getId());
	}
	public void value(int a)
	{
		System.out.println("Some Thread"+a);
	}
	public void run(int a)
	{
		System.out.println("Some Thread"+a);
	}

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		t2.start();
		t1.start();
		t1.run(4);
		t2.value(3);
		t1.value(2);

		
	}
	 
	

}

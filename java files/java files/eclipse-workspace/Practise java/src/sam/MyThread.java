package sam;

public class MyThread extends Thread{
public void run() {
	for(int i=0;i<13;i++) {
		System.out.println("User Thread...:"+Thread.currentThread().getName());
	}
}
public static void main(String[] args) throws InterruptedException {
	MyThread t1=new MyThread();
	MyThread t2=new MyThread();
	t2.start();
	t1.start();
    t1.join();//main will wait until start function is fully executed.
	t1.join(500);//runs upto 1000ms and main multithreading starts.
	for(int i=0;i<13;i++) {
		System.out.println("Main "+Thread.currentThread().getName());
	}
}
}

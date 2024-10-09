package sam;

public class Threadexample extends Thread {
public void run() {//overriding the run method
	for(int i=0;i<3;i++) {
		System.out.println("User Thread "+Thread.currentThread().getName());
	}
}
public static void main(String[] args) {
	Threadexample t=new Threadexample();
	Threadexample t1=new Threadexample();
	t.start();
	t1.start();
	System.out.println(Thread.currentThread().getName());
}
}

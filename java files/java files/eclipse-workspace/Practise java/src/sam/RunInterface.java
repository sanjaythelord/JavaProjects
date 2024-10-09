package sam;

public class RunInterface implements Runnable {

	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("User Thread...:"+Thread.currentThread().getName());
		}
	}
public static void main(String[] args) {
	RunInterface r=new RunInterface();
	Thread t=new Thread(r);//calling thread class parameterized constructor.
	t.start();
	for(int i=0;i<3;i++) {
		System.out.println("A Running");
	}
}
}

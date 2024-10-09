package multithreading;

public class MainThread {
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setName("Mythread");
		t.setPriority(1);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}
}

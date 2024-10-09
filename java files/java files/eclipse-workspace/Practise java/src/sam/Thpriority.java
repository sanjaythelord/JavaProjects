package sam;

public class Thpriority extends Thread {
public void run() {
	for(int i=0;i<3;i++)
	{
		String tname=Thread.currentThread().getName();
		int pri=Thread.currentThread().getPriority();
	    System.out.println("Default:"+tname);
		System.out.println("Default:"+pri);
		Thread.currentThread().setPriority(8);
		Thread.currentThread().setName("Sanjay");
		System.out.println(tname);
		System.out.println(pri);
		
	}
}
public static void main(String[] args) {
	Thpriority tp=new Thpriority();
	tp.start();
}
}

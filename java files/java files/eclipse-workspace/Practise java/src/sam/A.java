package sam;

public class A {
synchronized static void info(String name) throws InterruptedException {
for(int i=0;i<3;i++) {
	System.out.println("Given name is: "+name);
	Thread.sleep(1000);	
}
}
public static void main(String[] args) {
T1 t1=new T1();	
t1.start();
T2 t2=new T2();
t2.start();
T3 t3=new T3();
t3.start();
}
}


class T1 extends Thread{
	public void run() {
		try {
			A.info("sanjay");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class T2 extends Thread{
	public void run() {
		try {
			A.info("Kumar");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class T3 extends Thread{
	public void run() {
		try {
			A.info("shah");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


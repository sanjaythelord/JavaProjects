package sam;

public class Hierinherit {
public void info() {
	System.out.println("I live in kathmandu");
}
public static void main(String[] args) {
	B b=new B();
	C c=new C();
	c.info();
	b.info();
	c.info2();
	b.info1();
	
}

}
class B extends Hierinherit{
	public void info1() {
		System.out.println("I live in jhapa");
	}
}
class C extends Hierinherit{
	public void info2() {
		System.out.println("I live in birtamode");
	}
}

package OOP;

class Parent{
	public void test() {
		System.out.println("Parent class");
	}
}
class Child1 extends Parent{
	@Override
	public void test() {
		System.out.println("Child1 class");
	}
}
class Child2 extends Parent{
	@Override
	public void test() {
		System.out.println("Child2 class");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		//dynamic dispatch or polymorphism
		Parent p = new Child1();
		p.test();
		Parent p1 = new Child2();
		p1.test();

	}

}

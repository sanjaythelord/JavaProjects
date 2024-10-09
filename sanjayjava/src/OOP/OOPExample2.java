package OOP;

public class OOPExample2 {

	void display() {
		System.out.println("Display method is called.");
	}
	void info(String s) {
		System.out.println("Company name is: "+s);
	}
	public static void main(String[] args) {
		OOPExample2 oop = new OOPExample2();
		OOPExample2 op = new OOPExample2(); // creating multiple objects
		oop.display();
		oop.info("Coding Technology");
		op.display();

	}

}

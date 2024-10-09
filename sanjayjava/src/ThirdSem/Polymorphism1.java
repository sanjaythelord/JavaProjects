package ThirdSem;

/*Compile Time Polymorphism In Java is also known as Static Polymorphism.
 *Furthermore, the call to the method is resolved at compile-time. 
 *Compile-Time polymorphism is achieved through Method Overloading. */

class Shapes {
	  public void area() {
	    System.out.println("Areas of different shapes. ");
	  }
	public void area(int r) {
	    System.out.println("Circle area = "+3.14*r*r);
	  }

	public void area(double b, double h) {
	    System.out.println("Triangle area="+0.5*b*h);
	  }
	public void area(int l, int b) {
	    System.out.println("Rectangle area="+l*b);
	  }
	}

public class Polymorphism1 {

	public static void main(String[] args) {
		Shapes myShape = new Shapes();  // Create a Shapes object
	    myShape.area();
	    myShape.area(5);
	    myShape.area(6.02,1);
	    myShape.area(6,2);

	}
}

package pkg2;
//Arithmetic exception is thrown
//throw keyword is always used inside a method
//throw throws user defined exception
//throws keyword is used to provide the exception warning for the method.
public class MyThrow {
//within method signature
	void info(int v) throws ArithmeticException {
		/*
		 * if(v<18){ System.out.println("Valid within method signature."); }else {
		 * System.out.println("Invalid!!!"); }
		 */
		int a=0,b=10;
		//int c=v/a;
		int d=v/b;
	//	System.out.println(c);
		System.out.println(d);
	}
	//inside method
	//user defined exception
	void t1(int val) {
		if(val<20) {
			throw new ArithmeticException("Invalid input.");
		}else {
			System.out.println("Valid Input.");
		}
	}
	public static void main(String[] args) {
		MyThrow m = new MyThrow();
		try {
		//m.t1(0);
		//we can know that method info has exception while hovering
		m.info(100);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//every method should have try catch block for exception handling
		//when we give invalid input in t1 method the info method is not executed
		//within same try catch block.
	}
}

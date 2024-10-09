package Assignment;

public class Calculator {
	
	public int add(int a,int b) {
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
		return 0;
	}
	public float add(int a, float b) {
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
		return 0;
	}
	public float add(float a, int b) {
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
		return 0;
	}
	public float add(float a, float b) {
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
		return 0;
	}
	public double add(double a, double b) {
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
		return 0;
	}	
	public double add(int a, double b) {
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
		return 0;
	}
	public double add(double a, int b) {
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
		return 0;
	}
	public double add(double a, float b) {
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
		return 0;
	}
	public double add(float a, double b) {
		System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
		return 0;
	}
	
	public int multiply(int a, int b) {
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
		return 0;
	}
	public float multiply(int a, float b) {
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
		return 0;
	}
	public float multiply(float a, int b) {
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
		return 0;
	}
	public float multiply(float a, float b) {
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
		return 0;
	}
	public double multiply(double a, double b) {
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
		return 0;
	}
	public double multiply(int a, double b) {
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
		return 0;
	}
	public double multiply(double a, int b) {
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
		return 0;
	}
	public double multiply(double a, float b) {
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
		return 0;
	}
	public double multiply(float a, double b) {
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
		return 0;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		/* System.out.println("hello java"); */
		calc.add(2,8);
		calc.add(12.34,45.12);
		calc.multiply(2, 14);
		calc.multiply(7, 12.345);
		
		
	}

}

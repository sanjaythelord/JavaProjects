package OOP;


interface calculator{
	void sum(int a, int b);
}


public class interfaceCalculator {

	public static void main(String args[]) {
		
		calculator calc = (a,b)->System.out.println("sum is: "+(a+b));
		calc.sum(34, 40);
	}
}

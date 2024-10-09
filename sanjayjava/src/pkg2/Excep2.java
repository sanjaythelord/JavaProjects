package pkg2;

public class Excep2 {

	public void sum(int a, int b) {
		int c =a+b;
		System.out.println("sum of "+a+" and "+b+" is "+c);
	}
	public void division(int a, int b) {
		//try catch inside method
		
		/*
		 * try { int c = a/b; System.out.println("dividend is "+c); } catch(Exception e)
		 * { e.printStackTrace(); }
		 */
		int c = a/b;
		System.out.println("dividend is "+c);
	}
	public void arrayquery(int a[]) {
		a[0]=12;
		a[1]=11;
		try {
		a[2]=23;
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Numbers in array are:");
		for(int i=0;i<2;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Excep2 exc = new Excep2();
		int[] array = new int[2];
		exc.sum(12, 30);
		exc.arrayquery(array);
		try {
			exc.division(14, 0);
		}
		catch(ArithmeticException e) {
			//similarly NullPointerException and ArrayIndexOutOfBoundException can be written
			e.printStackTrace();
		}
	}
}

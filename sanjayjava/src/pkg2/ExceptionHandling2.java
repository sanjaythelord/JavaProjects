package pkg2;

public class ExceptionHandling2 {
	//method1 for ArrayOutOfBoundException
	public int arrayquery(int a[]) {
		//System.out.println("Array Index Out Of Bound Occured.");
		
		try{
		a[0]=12;
		a[1]=11;
		a[2]=23;
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Numbers in array are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		return 0;
	}
	//method2 for NullPointerException
	void length(String a[]) {
		System.out.println("Null Pointer Exception Occured.");
		System.out.println(a.length);
		
	}
	//method3 for ArithmeticExcption
	//user defined exception
	void salary(double salary) throws ArithmeticException {
		//System.out.println("Arithmetic Exception Occured.");
		if (salary < 10000) {
			throw new ArithmeticException("Junior Developer.");
		} else {
			System.out.println("Senior Developer.");
		}
	}
	//main method
	public static void main(String[] args) {
		System.out.println("***Exception Handling in Java***");
		ExceptionHandling2 exc =new ExceptionHandling2();
		//String[] arr = new String[3];
		String[] arr = null;
		int[] array = new int[2];
		
		//for ArrayOutOfBoundException
		exc.arrayquery(array);
		
		//for NullPointerException
		try {
		exc.length(arr);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//for udArithmeticException
		try {
		exc.salary(20000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("***All Exception are handled correctly***");
	}
}

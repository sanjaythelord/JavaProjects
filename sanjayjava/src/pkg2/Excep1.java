package pkg2;

public class Excep1 {
	
	void division(int a, int b) {
		System.out.println("Division is: "+(a/b));
	}
	public static void main(String[] args) {
		Excep1 ex = new Excep1();
		
		try {
		ex.division(12,0);
		}
		catch(Exception e) {
		    e.printStackTrace();
			System.out.println("Exception occurred in method.");
		}
		finally {
			System.out.println("It is always executed regardless of exception.");
		}
		System.out.println("Excecuted after finally.");

	}

}

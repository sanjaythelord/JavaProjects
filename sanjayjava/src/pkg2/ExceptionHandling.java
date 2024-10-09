package pkg2;

public class ExceptionHandling {

	public static void main(String[] args) {
		int c =20;
		try {
		System.out.println("Exception handling");
		double x =10/0.23;
		int y = 0/0;//undefine
		/* System.out.println(x); */
		//this statement is not executed
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally runs rest code");
		}
		  System.out.println(c);
	}
	
}

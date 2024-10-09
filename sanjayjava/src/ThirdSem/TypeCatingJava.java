package ThirdSem;

public class TypeCatingJava {

	public static void main(String[] args) {
		//float f = (float) 12.0;
		//implicit type casting, automatic type conversion by
		//compiler
		/*
		 * float fnum = (float) 10.43;
		 * 
		 * int inum = (int) fnum; System.out.println(inum);
		 */
		// implicit conversion or up-cast
		int num =100;
		long lnum = num;
		System.out.println(lnum);
		
		// explicit conversion or downcast
		double num1=23.5;
		int b = (int) num1;
		System.out.println(b);
		
	}

}

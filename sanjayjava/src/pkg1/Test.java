package pkg1;

public class Test {
	
	public static void main(String[] args) {
		int x = 7;
		long l = x;
		float f = (float) 34.98;
		System.out.println(x);
		System.out.println(l);
		double d = l;
		System.out.println(d);
		//constants variables
		final int a = 20;
		System.out.println(a);
		//a = 30; does not allow to assign other value rather than 20 
		//as its value is fixed with final keyword.
	}
	
	

}

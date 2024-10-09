package ThirdSem;

public class WrapperConcept {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		
		//primitive to non-primitive(Boxing)
		Integer aa = new Integer(a);
		System.out.println(aa);
		
		//for unboxing
		Integer i = new Integer(20);
		System.out.println(i);
		int n=i;
		System.out.println(n);
		
		//boxing
		double d = 34.5;
		System.out.println(d);
		Double dd = new Double(d);
		System.out.println(dd);
		
		//unboxing
		Double s = new Double(44.76);
		System.out.println(s);
		double r = s;
		System.out.println(r);
	}
}

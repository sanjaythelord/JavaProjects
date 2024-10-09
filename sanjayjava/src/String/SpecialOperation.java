package String;

public class SpecialOperation {

	public static void main(String[] args) {
		String s = "Java";
		System.out.println(s.length());
		
		String s1 = String.valueOf(s);
		System.out.println(s1);
		
		Integer x =5;
		System.out.println(x.toString());
		System.out.println(Integer.toString(12));
		System.out.println(s);// compiler writes s.toString()
		
		
	}
}

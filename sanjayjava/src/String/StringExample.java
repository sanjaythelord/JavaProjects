package String;

public class StringExample {

	public static void main(String[] args) {
		String s = "Lord Vedar";
		int x = 12;
		System.out.println("1. Uppercase: "+s.toUpperCase()); 
		System.out.println("2. Lowercase: "+s.toLowerCase());
		System.out.println("3. Trim: "+s.trim());
		System.out.println("4. StartsWith: "+s.startsWith("lo"));
		System.out.println("5. EndsWith: "+s.endsWith("ar"));
		//char ch1 = s.charAt(3);
		System.out.println("6. Character at 5: "+ s.charAt(5));
		System.out.println("7. Length: "+s.length());
		
		String s2 = s.intern();
		System.out.println("8. Intern: "+s2);
		
		String y=String.valueOf(x);  
		System.out.println("9. ValueOf: "+(x+8));
		
		String s1="Java Technology";
		String replaceString=s1.replace("Java", "JAVA");
		System.out.println("10. Replace: "+replaceString);

	}

}

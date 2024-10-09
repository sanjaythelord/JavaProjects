package String;

// The constructors used in String class are:
// 1. String()
// 2. String(String str)
// 3. String(char chars[]), etc.
// https://www.scientecheasy.com/2020/05/string-constructor.html/
// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html


public class StringConstructor {
	public static void main(String[] args) {
		
		String s = new String();//default construction to create empty string
		//String st = new String(String r); syntax
		String s1 = new String("Hello");
		System.out.println(s1);
		
		char chars[]= {'a','b','c'};
		String s2 = new String(chars);
		System.out.println(s2);
		
		//String str = new String(char chars[], int startIndex, int count);
		char letter[]= {'w','o','r','l','d'};
		String s3 = new String(letter, 1, 3);
		System.out.println(s3);
		
	}
	
}

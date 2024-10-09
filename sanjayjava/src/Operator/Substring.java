package Operator;

public class Substring {
//important note between heap and string constant pool
	//string immutability
	public static void main(String[] args) {
		String s = "hello";// stores in string constant pool
		String s1 = new String("hello");// heap area
		
		System.out.println(s1==s);

    String str = "sanjay shah";
    String result = str.substring(0, 1).toUpperCase() + str.substring(1,7) + str.substring(7,8).toUpperCase()+str.substring(8);
    System.out.println(result);
    
    String e = "   Sanjay Shah ";
    System.out.println(e);
    System.out.println(e.trim());
    
	}
}

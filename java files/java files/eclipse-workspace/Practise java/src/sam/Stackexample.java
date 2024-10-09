package sam;
import java.util.Stack;
public class Stackexample {
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("Apple");
		s.push("Banana");
		s.push("Cherry");
		s.push("Dragon fruit");
		//System.out.println(s);
		System.out.println("POP " +s.pop());
		System.out.println("POP " +s.pop());
		System.out.println("POP " +s.pop());
		System.out.println("POP " +s.pop());
		System.out.println(s);
		//stack is empty now
	}
}

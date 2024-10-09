package Assignment;

import java.util.StringTokenizer;

public class StrTokenizerExample3 {

	public static void main(String[] args) {
		 StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day","Good bye");
		 StringTokenizer st1 = new StringTokenizer("Good Morning");
		 System.out.println("Total number of Tokens: "+st.countTokens());
		 System.out.println("Total number of Tokens: "+st1.countTokens());
	}

}

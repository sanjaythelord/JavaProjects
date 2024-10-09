package Assignment;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("Coding Technology");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

}

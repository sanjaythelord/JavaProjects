package Assignment;
import java.util.Scanner;
public class ReadChar {

	// Java program to read character using Scanner
	// class

	public static void main(String[] args)
	{
	
		System.out.println("Enter a char: ");
	Scanner sc = new Scanner(System.in);

	// Character input
	char c = sc.next().charAt(0);

	// Print the read value
	System.out.println("c = "+c);
	
	}
}

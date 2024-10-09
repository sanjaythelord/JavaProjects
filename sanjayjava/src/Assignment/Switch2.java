package Assignment;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int marks = scanner.nextInt(); 
		int m = marks/10;
		switch(m) {
		case 1:
			System.out.println("Fail");
			break;
		case 2:
			System.out.println("Fail");
			break;
		case 3:
			System.out.println("Fail");
			break;
		case 4:
			System.out.println("Fail");
			break;
		case 5:
			System.out.println("Third division");
			break;
		case 6:
			System.out.println("Second division");
			break;
		case 7:
			System.out.println("First division");
			break;
		case 8:
			System.out.println("Distinction");
			break;
		case 9:
			System.out.println("A+");
			break;
		}
	}

}

package pkg1;

import java.util.Scanner;

public class Prime {	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);//constructor
		double a,p;
		System.out.println("Enter a number to check if number is prime or composite");
		System.out.println("Enter a number: ");
		a = s.nextInt(); 
		//String b = s.next();
		if (a%2==0) {
			System.out.println("Number is Composite.");
		}else {
			System.out.println("Number is Prime.");
		}	
	}
}

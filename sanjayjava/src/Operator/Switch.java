package Operator;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		boolean vowel = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=scanner.next().charAt(0); 
		
		switch(ch) {
		   case 'a' :
			   
		   case 'e' :
			   
	       case 'i' :
	    	   
		   case 'o' :
			   
		   case 'u' :
			  
		   case 'A' :
			   
		   case 'E' :
			   
		   case 'I' :
			   
		   case 'O' :
			   
		   case 'U' :
			   System.out.println("Is a vowel");
			   break;
		default:
			System.out.println("Is a consonent");
		}
		/*
		 * if(vowel == true) { System.out.println(ch+" is  a Vowel"); } else {
		 * if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		 * System.out.println(ch+" is a Consonant"); else
		 * System.out.println("Input is not an alphabet"); }
		 */
	}

}

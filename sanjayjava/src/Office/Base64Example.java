package Office;

import java.util.Base64;
import java.util.Scanner;

public class Base64Example {

	public static void main(String[] args) {
		Base64.Encoder enc = Base64.getEncoder();
		Base64.Decoder decoder = Base64.getMimeDecoder(); 
		
		System.out.println("Enter the message: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
	    System.out.println("\nChoose the action number:");
		System.out.println("1. Encrypt the message.");
		System.out.println("2. Decrypt the message.\n");
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		int num = Integer.parseInt(x);
		
		//simple encryption and decryption technique.
		/*
		 * String e = enc.encodeToString(s.getBytes());
		 * System.out.println("Encoded message is: "+e);
		 * 
		 * String d = new String(decoder.decode(e));
		 * System.out.println("Decoded message: "+d);
		 */
        
        
        switch(num) {
        case 1:
        	System.out.println("\nSelected action is Encryption.");
        	String e = enc.encodeToString(s.getBytes());
    		System.out.println("\nEncoded message is: "+e);
            break;
        case 2:
        	System.out.println("\nSelected action is Decryption.");
        	String d = new String(decoder.decode(s));  
            System.out.println("\nDecoded message: "+d);
            break;
         default:
        	 System.out.println("Error occured!!!");
        	 break;
        }
        	
	}
			
	}



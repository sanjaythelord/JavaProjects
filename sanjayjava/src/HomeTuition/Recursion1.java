package HomeTuition;

import java.util.Scanner;	

public class Recursion1 {

	static int n1=0,n2=1,n3=0;      
	static void printFibo(int count){      
        if(count>0){      
             n3 = n1 + n2;      
             n1 = n2;      
             n2 = n3;      
             System.out.print(" "+n3);     
             printFibo(count-1);      
         }      
     }       
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		//System.out.println(num);
	//	int count=num;
		System.out.print(n1+" "+n2);//printing 0 and 1      
	    printFibo(num-2);//n-2 because 2 numbers are already printed
	}

}

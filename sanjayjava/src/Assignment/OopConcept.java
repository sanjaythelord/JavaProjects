package Assignment;

import java.util.Scanner;

public class OopConcept {

	public int facto(int n) {
		for(int i=1;i<=n;i++) {
			n=n*i;
		}
		return n;
	}
	
	public void palindrome(int num) {
		int temp=num;
		int sum=0;
		int r;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");   
	}
	
	public void fibo() {
		int n1=0;
		int n2=1;
		int n3,i,count=10;
		System.out.print(n1+" "+n2);
		for(i=0;i<count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	
	public static void main(String[] args) {
		OopConcept op = new OopConcept();
		System.out.println("Enter the number to find its factorial: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//int y = op.facto(n);
		//System.out.println("Factorial of "+n+" is: "+y);
		System.out.println("Enter the number to check if palindrome: ");
		int num = scanner.nextInt();
		op.palindrome(num);
		System.out.println("Fibonacci series: ");
		op.fibo();
		 
	}
}

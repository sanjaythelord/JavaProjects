package Operator;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a= sc.nextInt();  
		int[] array= new int[a];
		for(int i=0;i<array.length;i++) {
		System.out.println("Enter the number in index: "+i);
		array[i]=sc.nextInt();
		if(i>0) {
			if(array[0]>array[i]) {
				array[0]= array[i];
			}
		}

		}
		System.out.println("Smallest number in given array is:"+array[0]);
	}
	
}

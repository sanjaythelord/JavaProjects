package Operator;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1=2,c1=2,r2=2,c2=2;
		int[][] a = new int[][] {{2,5},{4,8}};
		int[][] b = new int[][] {{4,9},{1,5}};
		int[][] c = new int[2][2];
		
		// Multiplying Two matrices
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
     // Displaying the result 
        System.out.println("Multiplication of two matrices is: ");
       //for each loop
		  for(int[] address : c) {
			  for (int data : address) {
				  System.out.print(data +" "); 
				  }
			  System.out.println(); 
			  }
//		 for(int[] data:c) {
//			 System.out.println(data);
//		 }
		  
		  System.out.println("Using nested for loop");
        // nested for loop
        for(int i = 0;i < c.length; i++) {
        	for(int j = 0; j<c.length; j++) {
        		System.out.print(c[i][j]+" ");
        	}	
        	System.out.println();
        }
		
		
		
		
		
		

}}

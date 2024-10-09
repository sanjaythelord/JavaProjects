 package Operator;

import java.util.Scanner;

public class MatrixAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		int[][] c = new int[2][2];
		for(int n=1;n<3;n++) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println("Enter the value for index "+i+"-"+j+" of "+n+" matrix");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Matrix "+n+" is");
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
			
		}
		if(n==1) {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					b[i][j]=a[i][j];
				}
			}
				}
		
		if(n==2) {
			System.out.println("\nSum of above two matrix is: ");
			for(int i=0;i<c.length;i++){    
				for(int j=0;j<c.length;j++){    
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");    
				}    
				System.out.println();
		}
		
		}
		
		}
		
	}
}

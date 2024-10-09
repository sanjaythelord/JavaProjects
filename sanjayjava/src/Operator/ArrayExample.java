package Operator;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExample {

	public static void main(String[] args) {
		String[] student = {"Sam","Biswa","Manoj","Derek","Erik","Filo","Gia","Aman","Isha","Jay"};
		System.out.println("Name of Students:");
		//using for-each loop
		for( String name : student) {
			System.out.print(name+" ");
		}
		int[] marks = {12,25,34,67,45,88,44,56,23,64};
		System.out.println("\nMarks of Students:");
		//using for loop
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" "); 
		}
		//array index starts from 0-(size of array-1)
		 System.out.println("\nHighest marks of Students:");
		 int max = marks[0];//max = 12
		  for(int j=0;j<marks.length;j++) { 
			  if (max < marks[j]) { 
			      max = marks[j];// max = 25
			  }
	}
		  System.out.println(max); 
		  
		  System.out.println("Lowest marks of Students:");
			 int maxj = marks[0];
			  for(int j=0;j<marks.length;j++) { 
				  if (maxj > marks[j]) {
				      maxj = marks[j];
				  }
		}
			  System.out.println(maxj); 
	
	System.out.println("Average marks scored:");
	int sum = 0;
	int avg = 0;
	for(int a=0;a<marks.length;a++) {
		sum = sum+marks[a];
	}
	avg=sum/10;
	System.out.println(avg);
	
	System.out.println("Sorted array");
	Arrays.sort(marks);
	for(int x:marks) {
		System.out.print(x+" ");
	}
}
}
// top 5 marks
// name marks and percentage


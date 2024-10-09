package Interview;

import java.util.Arrays;

// calculate second largest number in an array without using and with using sorting algorithm.
public class ArrayProblem {
	//method 1
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  
	
	//method 2
	public static int getSecondLargestNum(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-2];  
		}  

	public static void main(String[] args) {
		String name = "Sam";
		String  pet = "Sam";
		if(name!=pet) {
			System.out.println(" not equal");
		}else {
			System.out.println("equal");
		}
		
		//method 1
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		System.out.println("Second Largest: "+getSecondLargest(b,7));  
		
		//method 2
		System.out.println("Second Largest: "+getSecondLargestNum(a,6));  
		System.out.println("Second Largest: "+getSecondLargestNum(b,7));  
		
		//method without using sorting algorithm
		
		/*
		 * This example shows you how to find second largest number in an array
		 * 
		 * Step 1:
		 * 
		 * Iterate the given array
		 * 
		 * Step 2 (first if condition arr[i] > largest):
		 * 
		 * If current array value is greater than largest value then
		 * 
		 * Move the largest value to secondLargest and make
		 * 
		 * current value as largest
		 * 
		 * Step 3 (second if condition arr[i] > secondLargest )
		 * 
		 * If the current value is smaller than largest and greater than secondLargest
		 * then the current value becomes secondLargest
		 */
		
	    int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
	    int largest = arr[0];
	    int secondLargest = arr[0];
	    
	    System.out.println("The given array is:" );
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i]+"\t");
	    }
	    for (int i = 0; i < arr.length; i++) {
	 
	      if (arr[i] > largest) {
	        secondLargest = largest;
	        largest = arr[i];
	 
	      } else if (arr[i] > secondLargest) {
	        secondLargest = arr[i];
	 
	      }
	    }
	 
	    System.out.println("\nSecond largest number is:" + secondLargest);

	}

}

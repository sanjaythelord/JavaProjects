package OOP;

import java.util.Arrays;

public class OOP1 {
	
	public int[] sort(int[] array) {
		//Arrays.sort(array);
		//Bubble sort
		boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i] > array[i+1]) {
	                temp = array[i];
	                array[i] = array[i+1];
	                array[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
		return array;
	}
	
	public void print(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		OOP1 op = new OOP1();
		int[] array = {12,23,45,1,28,90};
		int[] array1 = new int[6];
		System.out.println("Unsorted array is: ");
		op.print(array);
		array1 = op.sort(array);
		System.out.println("\nSorted array is: ");
		op.print(array1);

	}

}

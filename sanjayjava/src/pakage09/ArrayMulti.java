package pakage09;

public class ArrayMulti {
// ragged array
	public static void main(String[] args) {
		//declaring and initializing 2D array
		int arr[][]= {{2,5,4},{6,4,9},{8,6,3}};
		
		 for (int i = 0; i < 3; i++)
	            for (int j = 0; j < 3; j++)
	                System.out.println("arr[" + i + "][" + j + "] = "
	                                   + arr[i][j]);	
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}

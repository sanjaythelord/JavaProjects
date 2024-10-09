package pkg2;

public class Array {
	
	
	public static void main(String[] args) {
		int[] ar = new int[3];
				ar[0]=10;
				ar[1]=20;
				ar[2]=22;
				
				//direct initialization of array
		String[] sa = {"Sanjay","Anish","Rakesh"};
				for(int f : ar){
					System.out.println(f);
				}
				for(String s : sa){
					System.out.println(s);
				}
	}

}

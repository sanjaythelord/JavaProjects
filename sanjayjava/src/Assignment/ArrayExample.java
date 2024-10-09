package Assignment;
//second smallest number in an array.
public class ArrayExample {

	public static void main(String[] args) {
		int a[]= {22,11,45,9,0,4,3,5};
		
		for(int i=0;i<a.length;i++) {
			int small=a[i];
			int temp;
			for(int j=0;j<a.length;j++) {
				if(a[j]>a[j+1]) {
				int x = a[j];
				temp=a[j];
				small=temp;
				}		
			}
		}	 
	}
}

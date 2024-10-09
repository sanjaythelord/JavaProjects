package Assignment;

public class LoopExample {

	public static void main(String[] args) {
		int i=11;
		while(i>10 && i<20) {
			System.out.println(i);
			i++;
		}
		//sum of numbers
		System.out.println("Sum of numbers:");
		int r=0;
		for(int j=1;j<=10;j++) {
			r=r+j;
		}
		System.out.println("Sum betwwen 1-10 is: "+r);
		
		System.out.println("Descending order:");
		//print in decrement order
		for(int k=15;k>=10;k--) {
			System.out.println(k);
		}
		
		System.out.println("Nested for loop examples:");
		
		System.out.println("AND operation:");
		System.out.println("a b a&b");
		for(int j=0;j<2;j++) {
			for(int k=0;k<2;k++) {
				System.out.println(j+" "+k+"  "+(j&k));
			}
		}
		
		System.out.println("OR operation:");
		System.out.println("a b a|b");
		for(int j=0;j<2;j++) {
			for(int k=0;k<2;k++) {
				System.out.println(j+" "+k+"  "+(j|k));
			}
		}
	
		
		
		System.out.println("Nested for loop example:");
		//example for nested loop
		for(int k=1;k<=3;k++) {
			for(int j=1;j<=3;j++) {
				System.out.println(k+" "+j);
			}
		}
		System.out.println("Next example for nested for loop:");
		//nested loop example
		for(int m=1;m<=5;m++) {
			for(int n=1;n<=m;n++) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}

}

package Interview;

public class ForLoopManipulation {
	public static void main(String[] args) {
		char a[] = {'O','R','C','H','I','D'};
		
		/*
		 * for(int i=0;i<=6;i++) { for(int j=0;j<=(6-i);j++) { System.out.print(a[i]); }
		 * System.out.println(); }
		 */
		
		for(int i=0;i<6;i++) {
			System.out.print(a[i]);
			
		}
		for(int m=1;m<=5;m++) {
			for(int n=1;n<=m;n++) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}

	
}

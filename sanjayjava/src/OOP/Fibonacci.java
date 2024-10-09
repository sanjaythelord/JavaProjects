package OOP;

public class Fibonacci {

	public void fibo() {
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1+" "+n2);
		/*
		 * for(i=0;i<count;i++) { n3=n1+n2; System.out.print(" "+n3); n1=n2; n2=n3; }
		 */
		while(n2<=50) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.fibo();

	}

}

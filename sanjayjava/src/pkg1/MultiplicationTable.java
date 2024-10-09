package pkg1;

public class MultiplicationTable {
	int i=0;
	void multiply(int x) {
		for(i=1;i<=10;i++) {
			System.out.println(x+" * "+i+" = "+x*i);
		}
	}
	public static void main(String[] args) {
		MultiplicationTable m = new MultiplicationTable();
		m.multiply(5);
	}
}

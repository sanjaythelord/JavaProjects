package pkg1;

public class country1 {
	String s ="";
	int x=0;
	String info() {
		s="PM";
		return s;
	}
	/*int roll() {
		
		 * x=10; if(x>5) { System.out.println("Number is greater than 5."); return x; }
		 * else { System.out.println("Number is less than 5."); return x; }
		 
		
	}
	*/
	int sums() {
		int mysum=0;
		mysum=50+100;
		return mysum;
	}
	public static void main(String[] args) {
		country1 c =new country1();
		String val = c.info();
		int v = c.sums();
		System.out.println(val);
		System.out.println(v);
	}
}

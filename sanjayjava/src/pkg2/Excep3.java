package pkg2;

public class Excep3 {
	void arrayfunction(int[] age) {
		int val=age[4];
	}
	
		public static void main(String[] args) {
			int[] age= {12,13,14};
			Excep3 exp = new Excep3();
			try {
			exp.arrayfunction(age);
			} catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("executed successfully.");
			}
		}
}

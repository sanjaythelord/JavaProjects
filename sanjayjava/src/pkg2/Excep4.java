package pkg2;

public class Excep4 {

	void size(int a[]) {
		System.out.println(a.length);
	}
	

	public static void main(String[] args) {
		int[] array = null;
		Excep4 exc = new Excep4();

		try {
			exc.size(array);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception occured");
		}
		System.out.println("executed.");

	}
}

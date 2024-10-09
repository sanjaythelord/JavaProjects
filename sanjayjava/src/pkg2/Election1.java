package pkg2;

public class Election1 {

	void validate(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("Not eligible for voting.");
		} else {
			System.out.println("Eligible for voting.");
		}
	}

	public static void main(String[] args) {
		Election1 el = new Election1();
		el.validate(22);

		try {
			el.validate(13);
		} catch (Exception e) {
			e.printStackTrace();
		}

		el.validate(45);
		System.out.println("Access Granted");
	}
}

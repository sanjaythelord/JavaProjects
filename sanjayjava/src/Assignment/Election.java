package Assignment;

public class Election {
	
	public void validateAge(int age) {
		try {
		if(age<18) {
			throw new ArithmeticException("Not eligible for voting.");
		}else {
			System.out.println("Eligible for voting.");
		}
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	public static void main(String[] args) {
		Election el = new Election();
		System.out.println("***Department of Voting***");
		el.validateAge(16);
		el.validateAge(23);
		System.out.println("Access Granted.");
	}
}

package ThirdSem;

public class FinalKeyword {

    final int speedlimit=100;//final variable
	void run() {
				System.out.println(speedlimit);
	}
	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword();
		//f.speedlimit=100;
		f.run();
		

	}

}

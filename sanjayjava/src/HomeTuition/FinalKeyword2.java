package HomeTuition;

public class FinalKeyword2 {

	final void run() {
		System.out.println("executed");
	}
	
	class Running extends FinalKeyword2{
		void rrun() {//does not give to override
			System.out.println("running");
		}
	}
	public static void main(String[] args) {
		
    //and if class is final it does not gives to extends.
	}

}

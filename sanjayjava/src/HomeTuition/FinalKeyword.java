package HomeTuition;

// Java final keyword is a non-access specifier that is used to  
// restrict a class,variable, and method.
// If we initialize a variable with the final keyword, then we cannot modify its value.
// If we declare a method as final, then it cannot be overridden by any subclasses. 
// And, if we declare a class as final, we restrict the other classes to inherit or extend it.
// final keyword with can be used in variables, class and, method.
public class FinalKeyword {

	final int speedlimit=100;//final variable
	void run() {
		//speedlimit=120;//compile time error occurs if we do not define int
		int speedlimit=120;
		System.out.println(speedlimit);
		
	}
	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword();
		f.run();
	}
}

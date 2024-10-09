package Assignment;
/*User Defined Exception or custom exception is creating your own exception class
and throws that exception using 'throw' keyword.
This can be done by extending the class Exception.
There are a few reasons to have user defined exceptions: 
You want to pass along extra information such as error codes.*/
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		//super(s);
		System.out.println(s);
	}
}
public class UDException {

	void Validate(int age)throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("Welcome to vote.");
	}
	public static void main(String[] args) {
		UDException ud = new UDException();
		try {
			ud.Validate(15);
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
	}
}

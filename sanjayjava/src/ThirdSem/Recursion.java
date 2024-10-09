package ThirdSem;

//Recursion in java is a process in which a method calls itself continuously.
// It makes the code compact but complex to understand.
// recursion to find factorial of the number. 

public class Recursion {

	static int factorial(int n){      
        if (n == 1)      
          return 1;      
        else      
          return(n * factorial(n-1));      
  }      
	
	public static void main(String[] args) {
		
		System.out.println("Factorial of 5 is: "+factorial(5));  
	}

}

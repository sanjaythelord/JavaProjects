package pakage09;
//A class that cannot be further extended is called a final class in Java.
//A final class is declared using the final keyword. 
//An abstract class cannot be a final class, hence, it can only be created
//when the class possesses a completion in nature.

//advantages
/*1.Ensures Data Immutability
2.Improves Performance and Productivity
3.Simplification of the Codes
4.Enhances Security Aspects 
5.Promotes Reusability of Codes*/
public final class FinalClassExample {
	    public void printMessage() {
	        System.out.println("This is a final class.");
	    }
}
//The FinalClass is declared as final in the above program,
//meaning it cannot be subclassed. The printMessage() method in 
//FinalClass prints the message "This is a final class."


//The Main class contains the main method, which creates an instance
//of FinalClass called finalObj. It then calls the printMessage() method
//on finalObj to display the message "This is a final class."
/*public class Main {
    public static void main(String[] args) {
        FinalClass finalObj = new FinalClass();
        finalObj.printMessage();
    }
}*/
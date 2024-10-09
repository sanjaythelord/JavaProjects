package Assignment;


//A Class that represents use-defined expception
class MyException1 extends Exception
{

}

public class UserDefinedException1 {

	public static void main(String[] args) {
		try
        {
            // Throw an object of user defined exception
            throw new MyException1();
        }
        catch (MyException1 ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }

	}

}

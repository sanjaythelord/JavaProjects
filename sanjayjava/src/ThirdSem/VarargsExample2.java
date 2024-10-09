package ThirdSem;

/*Varargs is a short name for variable arguments. 
 * In Java, an argument of a method can accept arbitrary number of values.
 *This argument that can accept variable number of values is called varargs.
 * WHY?
 * It is used for simplifying a method that requires a variable number of 
 * arguments. In java, we can't declare a method with a variable number of 
 * arguments until JDK 4.
 **/

public class VarargsExample2 {

	static void display(String... values){  
		  System.out.println("display method invoked ");  
		  for(String s:values){  
		   System.out.println(s);  
		  }  
		 }  
	
	public static void main(String[] args) {
		display();//zero argument   
		 display("hello");//one argument   
		 display("my","name","is","varargs");//four arguments 

	}

}

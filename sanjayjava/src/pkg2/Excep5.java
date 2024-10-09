package pkg2;

public class Excep5 {
// example for multiple catch block
	//only one block will be executed
	public static void main(String[] args) {
		 try{    
             int a[]=new int[5]; 
             System.out.println(a[10]); 
             String s = null;
             //System.out.println(s.length());
            // int b=12/0;    
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }  
		     finally {
            System.out.println("rest of the code");  
		       }
	}
}

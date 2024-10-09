package Interview;

/*The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
 * autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. 
 * The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.*/

//Java program to convert primitive into objects  
//Autoboxing example of int to Integer  

public class WrapperClass {
	public static void main(String args[]){  
		//Converting int into Integer  
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);  
		
		
		/*
		 * The automatic conversion of wrapper type into its corresponding primitive
		 * type is known as unboxing. It is the reverse process of autoboxing.
		 */
		
		
		//Java program to convert object into primitives  
		//Unboxing example of Integer to int  
		//Converting Integer to int    
		Integer b=new Integer(3);    
		int k=b.intValue();//converting Integer to int explicitly  
		int l=b;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(b+" "+k+" "+l);    
		}
}

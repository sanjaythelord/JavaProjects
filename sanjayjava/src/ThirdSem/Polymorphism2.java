package ThirdSem;

/*Runtime polymorphism in Java is also popularly known as Dynamic Binding
 *  or Dynamic Method Dispatch. In this process, the call to an 
 *  overridden method is resolved dynamically at runtime rather than 
 *  at compile-time. You can achieve Runtime polymorphism via
 *   Method Overriding.
 *   
 *  Overriding is done by using a reference variable of the superclass.
 *  The method to be called is determined based on the object which is 
 *  being referred to by the reference variable. 
 *  This is also known as Upcasting.*/


public class Polymorphism2 {
	class Animal{  
		  void eat(){
		System.out.println("Animals eat");
		}  
		}  
		class herbivores extends Animal{  
		  void eat(){
		System.out.println("Herbivores eat plants");
		} 
		  }
		class omnivores extends Animal{  
		  void eat(){
		System.out.println("Omnivores eat plants and meat");
		} 
		  }
		class carnivores extends Animal{  
		  void eat(){
		System.out.println("Carnivores eat meat");
		} 
		  }
	public static void main(String[] args) {
		Polymorphism2 p = new Polymorphism2();
		Animal A = p.new Animal();
		//Animal A = new Animal();
	    Animal h = p.new herbivores(); //upcasting  
		Animal o = p.new omnivores(); //upcasting  
	    Animal c = p.new carnivores(); //upcasting  
	    A.eat();
	    h.eat();
	    o.eat();  
	    c.eat(); 
	}
}

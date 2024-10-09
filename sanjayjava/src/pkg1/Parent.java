package pkg1;
 //method overriding
public class Parent {
	
	void pInfo() {
		System.out.println("This is a parent class method.");
	}
	void age(int a) {
		System.out.println("Age is: "+a);
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.pInfo();
		c.age(12);
	}

}
 class Child extends Parent{
	 
		//this is not overriding as does not match method signature
		/*
		 * void pInfo(int a) { System.out.println("This is a child class method."); }
		 */
	 
	 //this is overriding as it matches method signature
		
		  void pInfo() { System.out.println("This is a child class method."); }
		 
			
			  void age(int a) { 
				  System.out.println("Age of child is: "+a); 
				  }
			 
		 
 }
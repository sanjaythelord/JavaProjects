package Java_8_features;

interface A{
	void show();
}
 interface B {
	 void display(String s);
 }

//the whole purpose of this class is just to implement A
//we are using it only once

  class BCD implements A{
  
  @Override public void show() { 
	  System.out.println("Hello world from implemting class");
  
  }
  
  }
 
public class LambdaDemo {

	public static void main(String[] args) {
		
		A obje;//reference of interface
		  obje = new BCD();
		  obje.show();
		 
		
		//another way by creating anonymous class
		A obj;
		obj = new A() //Anonymous inner class
		{
			@Override
			public void show() {
				System.out.println("Hello world from inner class");
				
			}
			
		};
		obj.show();
		
		//using Lambda expression
		A objt;
		A object;
		objt = ()-> {
				System.out.println("Hello world using lambda expression");
			};
		objt.show();
			//if we need to execute only a single line code
			//then there is no need for curly brackets
		object = ()->System.out.println("Hello world");
		object.show();
		//lambda expression helps in reducing code
		//and implement functional interface
		//the main advantages of lambda expression is that we
		// don't need any inner or external class
		
		B ob;
		System.out.println("Using parameterized method");
		//use any
		//ob = (String s)->System.out.println("Hello "+s);
		//ob = (s)->System.out.println("Hello "+s);
		ob = s->System.out.println("Hello "+s);
		ob.display("world");
	}

}

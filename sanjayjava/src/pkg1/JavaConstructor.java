package pkg1;

public class JavaConstructor {

	int age;
	String name;
	
	//constructor 1 i.e. default constructor
	JavaConstructor(){
		System.out.println("Constructor is called");
	}
	
	// constructor 2 i.e parameterized constructor
	JavaConstructor(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		//calling default constructor
		JavaConstructor obj1 = new JavaConstructor();
		System.out.println("Hello");
		//calling parameterized constructor
		JavaConstructor obj2 = new JavaConstructor(12,"Ram");
		
	}
	
}

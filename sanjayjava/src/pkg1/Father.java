package pkg1;

public class Father {
	String name = "Ram";
	int salary = 100000;
	int age = 40;
	
	void fatherInfo() {
		System.out.println("Father name is: "+name);
		System.out.println("Fathers age is: "+age);
	}
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.salary); //accessing parent class variable
		s.fatherInfo(); //accessing parent class method from child class
		s.sonInfo(23);
		
	}
}
class Son extends Father{
	
	 int sonInfo(int x) {
		 System.out.println("Age of the son is: "+x);
		 return x;
	 }
}

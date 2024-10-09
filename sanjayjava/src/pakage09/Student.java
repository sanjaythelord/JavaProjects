package pakage09;

public class Student {
//a java class is a fully encapsulated class.
//In encapsulation, a class's variables are hidden from other classes
//and can only be accessed by the methods of the class in which they
//are found. Encapsulation in Java is an object-oriented procedure of 
//combining the data members and data methods of the class inside the 
//user-defined class.
	
//The Java Bean class is the example of a fully encapsulated class.
	private String name;
	private String address;
	
	//getter method for name
	public String getName() {
		return name;
	}
	//setter method for name
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	
	//we can perform here only but as per encapsulation we used
	// from other class
	/*
	 * public static void main(String[] args) { Student s = new Student();
	 * System.out.println(s.name); s.setName("Luke");
	 * System.out.println(s.getName()); }
	 */
}

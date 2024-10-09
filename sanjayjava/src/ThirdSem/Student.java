package ThirdSem;

public class Student {
//a java class is a fully encapsulated class.
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

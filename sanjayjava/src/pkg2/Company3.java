package pkg2;

public class Company3 implements Company,Company2 {

	@Override
	public void detail(String name, int empId) {
		System.out.println("Name is "+name+" and id is "+empId);
		
	}
	
	
	@Override
	public void age(int age) {
		System.out.println("Age is "+age);
		
	}
	
	public static void main(String[] args) {
		Company3 c = new Company3();
		c.detail("Sam", 11);
		c.age(25);
	}

}

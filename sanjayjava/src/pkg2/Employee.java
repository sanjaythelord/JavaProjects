package pkg2;

public class Employee implements Department{

	@Override
	public void detail(String name, int empId) {
		System.out.println("Name of employee is "+name+" and id is "+empId);
		
	}

	@Override
	public void Deptdetail(String name, int empNum) {
		
		System.out.println("Department name is "+name+" and number of employees are "+empNum);
	}
	


public static void main(String[] args) {
	Employee e = new Employee();
	e.detail("Darth", 12);
	e.Deptdetail("Frontend", 23);
}
}
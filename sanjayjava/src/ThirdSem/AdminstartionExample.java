package ThirdSem;

public class AdminstartionExample implements Administration {

	public static void main(String[] args) {
		AdminstartionExample ae = new AdminstartionExample();
		ae.faculty("IT");
		ae.office("IT Department");
		ae.office(null);
	}

	@Override
	public void faculty(String faculty) {
		System.out.println("This is "+faculty);
		
	}

	@Override
	public void office(String office) {
		System.out.println("This is "+office);
		
	}

}

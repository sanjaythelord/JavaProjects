package pakage09;

public class Freshers implements Administration,School {

	@Override
	public void schoolname(String name) {
	  System.out.println("Name of School is: "+name);
	}
	 
	@Override
	public void faculty(String faculty) {
		System.out.println("Faculty is: "+faculty);
	}
	
	public static void main(String[] args) {
		Freshers f = new Freshers();
		f.schoolname("K&K");
		f.faculty("BCA");
	}

	@Override
	public void office(String office) {
		// TODO Auto-generated method stub
		
	}
}

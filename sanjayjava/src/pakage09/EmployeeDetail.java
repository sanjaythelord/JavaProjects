package pakage09;

public class EmployeeDetail extends Employee {

	  @Override 
	  void info() { 
		  System.out.println("Information is listed here."); 
		  }
	 
	 
	
	public static void main(String[] args) {
		EmployeeDetail ed = new EmployeeDetail();
		ed.info();
		ed.detail();
		
	}

	
	
}

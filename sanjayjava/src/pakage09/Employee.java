package pakage09;

//abstraction example with EmployeeDetail

public abstract class Employee {
	//at least one abstract class
		abstract void info();
		//we can add extra normal method too.
		void detail() {
			System.out.println("Detail is here.");
		}
		
		
		/*
		 * public static void main(String[] args) { //Employee e = new Employee(); //we
		 * cannot make object of abstract class. }
		 */
}



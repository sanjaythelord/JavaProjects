package pkg1;

public class Friends {

	public static void main(String[] args) {
		Son s = new Son();
	
		System.out.println("Fathers name is: "+s.name);
		System.out.println("Fathers salary is: "+s.salary);
		System.out.println("Age of the son called from friend class is: "+s.sonInfo(22));

	}

}

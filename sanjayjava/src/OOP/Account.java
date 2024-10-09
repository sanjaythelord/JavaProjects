package OOP;

public class Account {

	String name;

	
	 public Account(String name) { 
		 System.out.println("name is: "+name); 
		 }
	 
	 public Account() {
		 System.out.println("Default constructor"); 
	 }
	 

	public static void main(String[] args) {
		Account a = new Account("sanjay");
	    Account a1 = new Account("Ram");
	    Account a2 = new Account();
	}
}

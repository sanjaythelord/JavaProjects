package pakage09;
//string is a sequence of character and is immutable in java.
//once created can never change the value. value is not changed to technoogy.
public class StringImp {
	
	public static void main(String[] args) {
		//we can create string by two ways i.e. literal way or Object.
		String n = new String("coding technology");
		String company="Coding";
		//store value in pool or stack.
	    System.out.println(company);
		company.concat("Technology");
		System.out.println(company);
		System.out.println(n.length());
		
		String name = "CT";
		if(name.equals("cT")) {
			System.out.println("String are equal");
			System.out.println(name);
		}else {
			System.out.println("not equals");
		}
		
		String nm = new String("CT");
		//it creates object dynamically and store value in heap.
		//since the value are in different memory it cannot be compared.
		if(nm == name) {
			System.out.println("similar");
		}else {
			System.out.println("cannot be executed");
		}
		
		//another
		String h1="abc";
		String h2="abc";
		String h3="def";
		System.out.println(h1.compareTo(h2));
		System.out.println(h2.compareTo(h3));
		System.out.println(h3.compareTo(h1));
		
	}
}

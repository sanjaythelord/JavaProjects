package pkg1;

public class Test2 {
//instance of State class can be used to access its parent class attribute inside
	//any other class in the same package. here it is pkg1.
	public static void main(String[] args) {
		State s =new State();
		System.out.println(s.name);

	}

}

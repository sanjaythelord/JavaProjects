package pkg1;

public class Country2 {
	String name = "Nepal";
	String pm = "KP Oli";
	public static void main(String[] args) {
		State s = new State();
		System.out.println(s.name);
		System.out.println(s.pm);
	}
}

//instance of class State can access parent class properties.
class State extends Country2{
	
	
}

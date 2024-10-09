package Assignment;

public class ImmutableString {

	public static void main(String[] args) {
		String name="Hello";
		name.concat("world");//immutable
		System.out.println(name);
		
		name=name.concat("world");//explicit call
		System.out.println(name);
				

	}

}

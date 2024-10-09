package Interview;
// The enum in Java is a data type which contains a fixed set of constants.
// Java Enums can be thought of as classes which have a fixed set of constants
// An enum type is a special data type that enables for a variable to be a set of predefined constants.
//  It is not necessary that the set of constants in an enum type stay fixed for all time

enum Size {
SMALL, MEDIUM, LARGE, EXTRALARGE
}

public class EnumExample {
	public static void main(String[] args) {
		System.out.println(Size.SMALL);
		System.out.println(Size.LARGE);
	}
}

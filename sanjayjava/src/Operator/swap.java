package Operator;

public class swap {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println("Without temp variable");
		int c = a+b;
		a= c-b;
		b= c-a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a);
		System.out.println("Other way");
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a);
		System.out.println("And with OR operator");
		int age=19;
		String gender="male";
		String result = age>18 && gender.equals("male")?"give 20% discount":"no discount";
		System.out.println(result);
		String result1 = age>18 || gender.equals("female")?"give 20% discount":"no discount";
		System.out.println(result1);
	}
}

package OOP;

public class AccessModifierFan {

	public static void main(String[] args) {
		Fan fan = new Fan(48,"Orient","Orient pvt.ltd");
		System.out.println(fan);
		Fan f = new Fan();
		System.out.println(f);
	}

}

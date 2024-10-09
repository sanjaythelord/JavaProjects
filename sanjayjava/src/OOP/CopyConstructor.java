package OOP;

public class CopyConstructor {
	
	int id;
	String name;
	
	public CopyConstructor(int i, String name) {
		id = i;
		this.name = name;
	}
	
	public CopyConstructor(CopyConstructor c) {
		id = c.id;
		name = c.name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		CopyConstructor c1 = new CopyConstructor(12,"Ram");
		CopyConstructor c2 = new CopyConstructor(c1);
		c1.display();
		c2.display();
	}
}

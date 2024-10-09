package sam;

public class Bean {
private String name;
private int rollno;
public void SetName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void SetRollno(int rollno) {
	this.rollno=rollno;
}
public int getRollno() {
	return rollno;
}
public static void main(String[] args) {
	Bean b=new Bean();
	String x;
	int y;
	b.SetName("Sanjay");
	x=b.getName();
	b.SetRollno(28);
	y=b.getRollno();
	System.out.println("Name is:"+x);
	System.out.println("Roll no is:"+y);
}
}

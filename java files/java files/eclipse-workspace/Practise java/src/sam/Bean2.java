package sam;

public class Bean2 {
private String name,address;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
public static void main(String[] args) {
	Bean2 b=new Bean2();
	String x;
	String y;
	b.setName("Sanjay");
	x=b.getName();
	b.setAddress("btm");
	y=b.getAddress();
	System.out.println("Name is:"+x);
	System.out.println("Address is:"+y);
}
}

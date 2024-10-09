package pakage09;
//address bhanne class ko variable use garera tyo class ko method lai Emp class ma implement gareko ho....HAS A RELATION
public class Emp {
	String name;
	Address adr;
	
	Emp(String name, Address adr){
		this.name=name;
		this.adr=adr;
	}
	
	void detail() {
		System.out.println("Name is: "+this.name);
		System.out.println("City is: "+this.adr.getCity());
		System.out.println("Ward is: "+this.adr.getWard());
	}
	
	public static void main(String[] args) {
		Address adr = new Address("Ktm",02);
		Emp e = new Emp("Sanjay",adr);
		e.detail();
		
	}
}

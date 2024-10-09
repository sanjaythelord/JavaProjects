package pkg2;

public class Valley implements Kathmandu,Lalitpur {

	@Override
	public void numOfOffice(int n) {
		System.out.println("No. of office are: "+n);
		
	}

	@Override
	public void CDO() {
		System.out.println("CDO name is ...");
		
	}

	@Override
	public void name(String name) {
		System.out.println("Name is: "+name);
		
	}
	public static void main(String[] args) {
		Valley v = new Valley();
		v.CDO();
		v.name("Bhaktapur");
		v.numOfOffice(5);
	}
}

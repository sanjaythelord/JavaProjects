package OOP;

public class Fan implements java.io.Serializable{
	private int serialnum;
	private String brand;
	private String company;
	Fan(){
		System.out.println("No details provided.");
	}
	Fan(int serialnum,String brand, String company){
		this.serialnum=serialnum;
		this.brand=brand;
		this.company=company;
	}
	public int getSerialNum() {
		return serialnum;
	}
	public void setSerialNum(int serialnum) {
		this.serialnum=serialnum;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company=company;
	}
	@Override
	public String toString() {
		return "Fan(SerialNum: "+serialnum+",Brand: "+brand+",Company: "+company+")";
	}
}

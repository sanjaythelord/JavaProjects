package OOP;

public class GetSet {
	//POJO(Plain old java object)
	private int registerId;
	private String name;
	private String location;
	private int position;
	//getter for registerId
	public int getRegisterId(){
	return registerId;
	}
	//setter for registerId
	public void setRegisterId(int registerId){
	this.registerId=registerId;
	}
	//getter for name
	public String getName(){
	return name;
	}
	//setter for name
	public void setName(String name){
	this.name=name;
	}
	//getter for location
	public String getLocation() {
		return location;
	}
	//setter for location
	public void  setLocation(String location) {
		this.location=location;
	}
	//getter for position
		public int getPosition() {
			return position;
		}
	//setter for location
	public void  setPosition(int location) {
		this.position=position;
	}
	

}

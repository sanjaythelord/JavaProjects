package pakage09;
//to implement a has a relationship in Emp class
//the techique is for code reuseability and aggregation.

//Getters and setters are used to protect your data,
//particularly when creating classes.
//For each instance variable, a getter method returns its value 
//while a setter method sets or updates its value.

public class Address {
	String city;
	int ward;
	
	Address(String city, int ward){
		this.city=city;
		this.ward=ward;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getWard() {
		return ward;
	}

	public void setWard(int ward) {
		this.ward = ward;
	}
	
}

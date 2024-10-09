package OOP;
//Rain is water.
public class Rain extends Water {
	private String container;
	
	//super
	
	  Rain(String container,String name, String chemicalCombination){ 
	  //it calls blank constructor of water.
	   //super();
	  super(name,chemicalCombination);
	  this.container=container;
	  
	  }
	 
	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}
	
	// see 8th july tutorial 01:35:00
}

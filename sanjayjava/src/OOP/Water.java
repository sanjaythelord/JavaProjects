package OOP;
//Getters and setters are used to protect your data,
//particularly when creating classes.
//For each instance variable, a getter method returns its value 
//while a setter method sets or updates its value.
public class Water {
	private String name;
	private String chemicalCombination;
	
	
	Water(){
		System.out.println("Molecular formula of water is H2O. And i am constructor of water.");
	}
	//parameterized constructor.
	Water(String name,String chemicalCombination){
		this.name=name;
		this.chemicalCombination=chemicalCombination;
		System.out.println("name is: "+name+" and Chemical Combination is: "+chemicalCombination);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChemicalCombination() {
		return chemicalCombination;
	}
	public void setChemicalCombination(String chemicalCombination) {
		this.chemicalCombination = chemicalCombination;
	}
	
}

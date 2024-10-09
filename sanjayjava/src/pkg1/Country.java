package pkg1;

public class Country {
	
	void pmName(String name) {
		switch(name) {
		case "Nepal":
			System.out.println("PM of Nepal is KP Sharma Oli.");
			break;
		case "India":
			System.out.println("PM of India is Narendra Modi.");
			break;
		default:
			System.out.println("Else PM is Sanjay Shah.");
		}
	}

	public static void main(String[] args) {
		Country c = new Country();
		c.pmName("Nepal");
		c.pmName("India");
		c.pmName("");

	}

}

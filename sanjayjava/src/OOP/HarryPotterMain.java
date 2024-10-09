package OOP;

public class HarryPotterMain {

	public static void main(String[] args) {
		Witch witch = new Witch();
		witch.setId(1);
		witch.setName("Dumbledore");
		
		HarryPotter harry = new HarryPotter();
		harry.setPrice(300);
		harry.setIsbn("HIOU_VVHS");
		harry.setWitch(witch);
		
		System.out.println("Harry Potter details: ");
		System.out.println("Price of book: "+harry.getPrice());;
		System.out.println("Witch details: "+harry.getWitch().getId()+" Name of witch "+harry.getWitch().getName());

	}

}

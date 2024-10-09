package OOP;

public class CarMain {

	public static void main(String[] args) {
		
		Engine e = new Engine();
		e.setId(1);
		e.setPrice(1000);
		
		Car car = new Car();
		car.setName("Audi");
		car.setModel("R8");
		car.setEngine(e);
		
		System.out.println("Car details: ");
		System.out.println("Name of car: "+car.getName()+" and model is: "+car.getModel());
		
		System.out.println("Engine details: ");
		System.out.println("Engine is: "+e.getId()+" and price is: "+e.getPrice());
		
		System.out.println("other: "+car.getEngine().getId());

	}

}

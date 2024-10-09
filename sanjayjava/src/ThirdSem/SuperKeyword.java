package ThirdSem;
class Vehicles{
	int max_speed=100;
	void message() {
		System.out.println("Message block.");
	}
}
class Car extends Vehicles{
	int max_speed=180;
	//super with variables
	void display() {
		System.out.println("Maximum speed: "+ super.max_speed);
	}
	//super in method
	void message(){
		super.message();
		System.out.println("Message of sub block.");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Car c = new Car();
		c.display();
		c.message();
	}
}

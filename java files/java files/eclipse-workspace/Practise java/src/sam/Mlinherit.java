package sam;

public class Mlinherit {
	public void countrychars() {
		System.out.println("It has Mount Everest.");
		System.out.println("It is a landlocked country.");
	}
	public static void main(String[] args) {
		District d=new District();
		d.countrychars();
		d.statefund();
	}
}

class State2 extends Mlinherit {
public void statefund() {
	System.out.println("States is funding well.");
}
}

class District extends State2{
	
}

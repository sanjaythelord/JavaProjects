package sam;

public class Sinherit {//access modifier should be less than child class modifier
String cname="Nepal";
int states=7;
public void countrychars() {
	System.out.println("It has Mount Everest.");
	System.out.println("It is a landlocked country.");
}
public static void main(String[] args) {
	State s=new State();
	Sinherit i=new Sinherit();
	i.countrychars();
	s.countrychars();
	s.statefund();
}
}

class State extends Sinherit{//creating a child class
public void statefund() {
	System.out.println("States is funding well.");
}
public void countrychars() {
	System.out.println("Child class is overriding.");//method overriding concept has override the parent class method
}
}
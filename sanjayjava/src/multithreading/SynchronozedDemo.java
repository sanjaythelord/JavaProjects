package multithreading;

class SA extends Thread{
	BankAccount ba;
	SA(BankAccount ob){
		ba=ob;
	}
	public void run(){
		ba.deposit(1000);
	}
}

class SB extends Thread{
	BankAccount ba;
	SB(BankAccount ob){
		ba=ob;
	}
	public void run(){
		ba.deposit(5000);
	}
}

class SC extends Thread{
	BankAccount ba;
	SC(BankAccount ob){
		ba=ob;
	}
	public void run(){
		ba.deposit(2000);
	}
}


 class BankAccount{
	double balance;
	public synchronized void deposit(double amount) {
		balance = amount;
		System.out.println("The balance is:"+balance);
	}
}
public class SynchronozedDemo {
	public static void main(String args[]) {
		BankAccount ob = new BankAccount();
		SA ob1 = new SA(ob);
		SB ob2 = new SB(ob);
		SC ob3 = new SC(ob);
		ob1.start();
		ob2.start();
		ob3.start();
	}
}

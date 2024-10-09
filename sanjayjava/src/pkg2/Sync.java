package pkg2;

public class Sync{
	static void msg(String name) {
		for(int i=0;i<3;i++) {
			System.out.println("Name is: "+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	public void msg(int age) {
		for(int i=0;i<3;i++) {
			System.out.println("Name is: "+age);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		
	}
}

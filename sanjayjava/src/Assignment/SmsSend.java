package Assignment;

public class SmsSend extends Thread {
	public synchronized void sendSms(int phone) {
		System.out.println("message is sending ....");
	}

	public static void main(String[] args) {
		SmsSend ss = new SmsSend();
		for(int i=125;i<130;i++) {
		ss.sendSms(i);
		}
	}

}

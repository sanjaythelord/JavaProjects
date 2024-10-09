package pkg2;


//look up for the MyThread.java for userdefined exception

public class UdException extends Exception {

	public UdException(String errorMessage) {
		super(errorMessage);
	}
	
	public static void main(String[] args) {
		UdException ue = new UdException("error occured");

	}

}

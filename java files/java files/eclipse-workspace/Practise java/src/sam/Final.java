package sam;

public class Final {
public final String country="Nepal";
void mycountry() {
	//country="India";
	System.out.println("I live in " +country);
}
public static void main(String[] args) {
	Final f=new Final();
	f.mycountry();
}
}

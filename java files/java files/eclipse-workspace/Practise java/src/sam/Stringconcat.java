package sam;

public class Stringconcat {
public static void main(String[] args) {
	//synchronized
	StringBuffer sb=new StringBuffer("Subject :");
	sb.append("Java");
	System.out.println(sb);
	//non-synchronized
	StringBuilder sbd=new StringBuilder("Today :");
	sbd.append("Friday");
	System.out.println(sbd);
}
}

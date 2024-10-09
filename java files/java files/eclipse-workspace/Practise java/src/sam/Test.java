package sam;

public class Test {
public static void main(String[] args) {
	int x=10;
	
switch(x){
	case 10:case 40:case 50:
		System.out.println("10th block");
		break;
	case 20:case 60:
		System.out.println("20th block");
		break;
	case 30:
		System.out.println("30th block");
		break;
		default:
			System.out.println("Default block");
			break;
}
}
}

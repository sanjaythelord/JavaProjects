package Operator;

public class IfelseSwitch {

	public static void main(String[] args) {
		
		int marks = 58;
		if(marks<40)
			System.out.println("Failed");
		else if(marks>=40 && marks<50)
			System.out.println("3rd Division");
		else if(marks>=50 && marks<60)
			System.out.println("2nd Division");
		else if(marks>=60 && marks<80)
			System.out.println("1st Division");
		else
			System.out.println("Distinction");
	if(marks%2!=0) {
		System.out.println("Weird");
	}else { 
		if( marks>=1 && marks<=4)
		System.out.println("Not Weird");
		else if(marks>=5 && marks<=7)
		System.out.println("Weird");
		else if(marks>=8 && marks<=10)
		System.out.println("Not Weird");
	}

	}
}

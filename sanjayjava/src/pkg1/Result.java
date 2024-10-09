package pkg1;

public class Result {
	
	//nested condition
	void result(int val) {
		//int v = 20;
		if(val<30) {
			System.out.println("value is less than thirty.");
		if(val==20) {
			System.out.println("value is twenty.");
		}
		}
		else
			System.out.println("More then thirty.");
	}
	
	//conditional statement
	void calcuateResult(int marks) {
		if(marks<30)
			System.out.println("Failed");
		else if(marks>=30 && marks<40)
			System.out.println("3rd Division");
		else if(marks>=40 && marks<60)
			System.out.println("2nd Division");
		else if(marks>=60 && marks<80)
			System.out.println("1st Division");
		else
			System.out.println("Distinction");
	}
	
	//switch statement
	void myRes(int m) {
		String var;
		switch(m) {
		case 10:
			System.out.println("First case");
			var = "First";
			break;
		case 20:
			System.out.println("Second Case");
			var = "Second";
			break;
		default:
			System.out.println("Default value");
			var = "Default";
		}
		System.out.println(var);
	}

	//main function
	public static void main(String[] args) {
		Result r = new Result();
		r.calcuateResult(20);
		r.calcuateResult(35);
		r.calcuateResult(48);
		r.calcuateResult(60);
		r.calcuateResult(82);
		r.result(40);
		r.result(15);
		r.result(20);
		r.myRes(20);
		r.myRes(13);
	}
}

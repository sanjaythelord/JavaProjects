package sam;

public class Result {
int mark;
public Result(int mark) {
this.mark=mark;
}
void myResult() {
	if(mark>=40 && mark<=50) {
		System.out.println("Just pass");
	}
	else if(mark>=50 && mark<=70){
		System.out.println("First division");
	}
	else if(mark>=70) {
		System.out.println("Distinction");
	}
}

public static void main(String[] args) {
Result r = new Result(80);
r.myResult();
}
}


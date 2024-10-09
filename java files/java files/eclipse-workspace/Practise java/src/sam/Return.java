package sam;

public class Return {
	
	int mark;

		String myReturn(int mark) {
			String status="";
			if(mark>=40 && mark<=50) {
				status="Just pass";
			}
			else if(mark>=50 && mark<=70){
				status="First division";
			}
			else if(mark>=70) {
				status="Distinction";
			}
			return status;
		}

		public static void main(String[] args) {
		Return r = new Return();
		String x;
		int m=40;
		x=r.myReturn(m);
		System.out.println("The result is "+x);
		}
		}




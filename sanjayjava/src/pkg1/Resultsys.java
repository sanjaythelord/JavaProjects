package pkg1;

public class Resultsys {
	String x="";
	boolean b;
	String result(int marks) {
		if(marks<40) {
			x="fail";
		}
		if(marks>40) {
			x="Pass";
		}
		return x;
	}
	boolean res(int m) {
		if(m>40) {
			b=true;
		}
		else
			b=false;
		return b;
	}

	public static void main(String[] args) {
		
		Resultsys r = new Resultsys();
		String s = r.result(20);
		String p = r.result(80);
		boolean b = r.res(75);
		System.out.println(s);
		System.out.println(p);
		System.out.println(b);
	}

}

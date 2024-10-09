package pakage09;

public class LambdaExpression {

	public static void main(String[] args) {
		//lambda expression
		Calc c = (a,b)-> a+b;
		int s = c.add(5,10);
		System.out.println(s);
		
		//lambda expression
		Calc2 c2 = (a,b)->System.out.println(a-b);
		c2.sub(16, 8);

	}

}

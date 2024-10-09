package HomeTuition;

class OuterClassA {
	  int x = 10;

	  static class InnerClassA {
	    int y = 5;
	  }
	}

public class InnerClass2 {

	public static void main(String[] args) {
		 OuterClassA.InnerClassA myInner = new OuterClassA.InnerClassA();
		    System.out.println(myInner.y);
		   // System.out.println(myInner.x);
	}

}

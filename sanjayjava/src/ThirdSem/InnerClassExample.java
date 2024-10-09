package ThirdSem;

class OuterClass {
	  int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
	}

public class InnerClassExample {

	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		System.out.println(myOuter.x);
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);
	    // outputs 5+10 is 15

	}

}

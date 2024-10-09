package HomeTuition;

class OutClass {
	  int x = 10;

	  class InnClass {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
	}

public class InnerClass3 {

	public static void main(String[] args) {
		OutClass myOuter = new OutClass();
	    OutClass.InnClass myInner = myOuter.new InnClass();
	    System.out.println(myInner.myInnerMethod());
	}
}

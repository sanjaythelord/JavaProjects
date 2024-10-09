package HomeTuition;

class OuterClass1 {
	  int x = 10;

	  private class InnerClass1 {
	    int y = 5;
	  }
	}

public class InnerClass1 {

	public static void main(String[] args) {
		OuterClass1 myOuter = new OuterClass1();
	  //  OuterClass1.InnerClass1 myInner = myOuter.new InnerClass1();
	   // System.out.println(myInner.y + myOuter.x);
		
		// error occurs if we remove comment

	}

}

package Assignment;

public class BreakandContinue {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
		}
		System.out.println("For continue:");
		//for continue
		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++;
		}
	}

}

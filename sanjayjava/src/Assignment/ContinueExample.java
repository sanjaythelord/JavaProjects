package Assignment;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            // If the number is 2
            // skip and continue
            if (i == 2)
                continue;
 
            System.out.print(i + " ");
        }
		System.out.println();
		System.out.println("2 is not printed.");
		
		 // First label
	    first:
	        for (int i = 0; i < 3; i++) {
	        // Second label
	        second:
	            for (int j = 0; j < 3; j++) {
	                if (i == 1 && j == 1) {
	 
	                    // Using continue statement with label
	                    continue first;
	                }
	                System.out.println(i + " " + j);
	            }

	}
	    System.out.println("1 operation is not performed after 1 0");
	    System.out.println("this is because the i value is increment to 2 after continue.");

	}
}

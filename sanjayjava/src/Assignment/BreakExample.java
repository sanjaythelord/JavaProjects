package Assignment;

public class BreakExample {

	public static void main(String[] args) {
		// Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {
            // Terminate the loop when i is 5
            if (i == 5)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Out of Loop");
    	
	// First label
    first:
        for (int i = 0; i < 3; i++) {
        // Second label
        second:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
 
                    // Using break statement with label
                    break first;
                }
                System.out.println(i + " " + j);
            }
        }
}
}



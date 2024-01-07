/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int number = 0;
        int nextNumber;
	// # Feedback: Please review the indentation in your code for consistency. Ensure that each level of indentation is aligned correctly to improve readability.

        do {
            nextNumber = (int)(Math.random() * 10);
	    
	    // # Feedback: Consider adding spaces for better readability, and clarify the logic.
            if (nextNumber >= number) {
                System.out.print(nextNumber + " ");
                number = nextNumber;
            } else {
                break;
            }
        } while (true);
  }
}

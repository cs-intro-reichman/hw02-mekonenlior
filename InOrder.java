/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int number = 0;
        int nextNumber;

        do {
            nextNumber = (int)(Math.random() * 10);
            if (nextNumber >= number) {
                System.out.print(nextNumber + " ");
                number = nextNumber;
            } else {
                break;
            }
        } while (true);
  }
}

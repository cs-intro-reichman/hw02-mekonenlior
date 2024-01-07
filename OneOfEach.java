
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double birth;
		int sumOfChildren = 0;
		int boys = 0;
		int girls = 0;

		// # Feedback: Your code is well-indented, which aids readability. Good job!
		do {
			birth = Math.random();
			if (birth <= 0.5) {
				System.out.println("b");
				boys++;
			} else {
				System.out.println("g");
				girls++;
			}
			sumOfChildren = boys + girls;
		} while (boys < 1 || girls < 1);
		System.out.println("You made it. . . and now you have " + sumOfChildren + " children");
	}
}

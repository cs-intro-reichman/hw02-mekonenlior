
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double birth;
		int sumOfChildren = 0;
		do {
			birth = Math.random();
			if (birth <= 0.5) {
				System.out.println("b");
				sumOfChildren++;
			} else {
				System.out.println("g");
				sumOfChildren++;
			}
		} while (true);
	}
}

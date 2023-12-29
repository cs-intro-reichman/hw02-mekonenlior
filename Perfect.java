/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
        int sumOfDivisors = 1; // Start with 1 as the first divisor

        System.out.print(N + " is a perfect number since ");
        System.out.print(N + " = 1");

        // Print remaining divisors (excluding 1 and N) and calculate their sum
        for (int i = 2; i <= N; i++) { // Loop up to N instead of N/2 + 1
            if (N % i == 0) {
                System.out.print(" + " + i);
                sumOfDivisors += i;
            }
        }

        // Check for perfect number
        if (sumOfDivisors == N) {
            System.out.println(".");
        } else {
            System.out.println(" but is not a perfect number.");
        }
	}
}

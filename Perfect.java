/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
        int sumOfDivisors = 1; // Include 1 as a divisor
        String divisors = "";

        for (int i = 2; i < N; i++) {  // Start from 2 to avoid duplicates
            if (N % i == 0) {
                sumOfDivisors += i;
                divisors += " + " + i;
            }
        }

        if (sumOfDivisors == N) {
            System.out.println(N + " is a perfect number since " + N + " = 1" + divisors);
        } else {
            System.out.println(N + " is not a perfect number");
        }
	}
}

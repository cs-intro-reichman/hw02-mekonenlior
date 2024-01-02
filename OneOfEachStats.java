import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {

        int T = Integer.parseInt(args[0]);
        int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);

        int totalChildren = 0;
        int familiesWith2 = 0;
        int familiesWith3 = 0;
        int familiesWith4OrMore = 0;
        int mostCommonCount = 0;
        int mostCommonNumberOfChildren = 0;

        for (int i = 1; i <= T; i++) {
            int sumOfChildren = 0;    
            int boys = 0;           
            int girls = 0;          
            do {
                if (generator.nextDouble() <= 0.5) {
                    boys++;
                } else {
                    girls++;
                }
                sumOfChildren = boys + girls;
            } while (boys < 1 || girls < 1);
            totalChildren += sumOfChildren;
            if (sumOfChildren == 2) {
                familiesWith2++;
                if (familiesWith2 > mostCommonCount) {
                    mostCommonCount = familiesWith2;
                    mostCommonNumberOfChildren = 2;
                }
            } else if (sumOfChildren == 3) {
                familiesWith3++;
                if (familiesWith3 > mostCommonCount) {
                    mostCommonCount = familiesWith3;
                    mostCommonNumberOfChildren = 3;
                }
            } else {
                familiesWith4OrMore++;
                if (familiesWith4OrMore > mostCommonCount) {
                    mostCommonCount = familiesWith4OrMore;
                    mostCommonNumberOfChildren = 4; // Or more, as needed
                }
            }
        }
        
        double average = (double) totalChildren / T;
        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + familiesWith2);
        System.out.println("Number of families with 3 children: " + familiesWith3);
        System.out.println("Number of families with 4 children or more: " + familiesWith4OrMore);
        System.out.println("The most common number of children is " + mostCommonNumberOfChildren);    
	}
}

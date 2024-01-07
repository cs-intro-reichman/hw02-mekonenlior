/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {

		/*
  		# feedback:
    		Code Structure:
		Your code is well-structured and effectively calculates statistics about families. Good job!
		Variable Naming:
		Variable names are clear and descriptive, aiding in understanding the purpose of each variable. Well done!
		Formatting:
		Ensure consistent formatting and indentation to improve code readability. Your indentation appears inconsistent in some places.
		*/
		int T = Integer.parseInt(args[0]);
		int totalChildren = 0;
        int familiesWith2 = 0;
        int familiesWith3 = 0;
        int familiesWith4OrMore = 0;

		for (int i = 1; i <= T; i++) {
			double birth;
		int sumOfChildren = 0;
		int boys = 0;
		int girls = 0;
		do {
			birth = Math.random();
			if (birth <= 0.5) {
				boys++;
			} else {
				girls++;
			}
			sumOfChildren = boys + girls;
		} while (boys < 1 || girls < 1);
		totalChildren += sumOfChildren;
		if (sumOfChildren == 2) {
			familiesWith2++;
		} else if (sumOfChildren == 3) {
			familiesWith3++;
		} else {
			familiesWith4OrMore++;
		}
	        }
			double average = (double) totalChildren / T;
		int mostCommon = Math.max(Math.max(familiesWith2, familiesWith3), familiesWith4OrMore);

		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familiesWith2);
		System.out.println("Number of families with 3 children: " + familiesWith3);
		System.out.println("Number of families with 4 children or more: " + familiesWith4OrMore);
		System.out.println("The most common number of children is " + mostCommon);
		}
	}

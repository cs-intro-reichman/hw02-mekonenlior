/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        int middleIndex = reversedWord.length() / 2;
        char middleChar = reversedWord.charAt(middleIndex);

        System.out.println(reversedWord);
        System.out.println("The middle character is " + middleChar);
	}
}

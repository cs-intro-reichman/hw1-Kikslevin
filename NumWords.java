// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	int number = 623;
	int hundreds = number / 100;
	int tens = (number % 100) / 10;
	int units = number % 10;
	System.out.println("The number " + number + " consists of:");
	System.out.println(hundreds + " hundreds, " + tens + " tens, and " + units + " ones.");
	}
}

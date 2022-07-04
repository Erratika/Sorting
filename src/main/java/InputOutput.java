import java.lang.annotation.Documented;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputOutput {
	private SortManager sm;

	public InputOutput(SortManager sm) {
		this.sm = sm;

	}

	public int getDesiredArrayLength() {
		System.out.println("Please enter the desired size of the array you want to use as a valid integer e.g. 1,2,3,4...");
		return validInteger();
	}

	/**
	 * Checks to see if user input is a valid integer.
	 *
	 * @return a valid integer > 0
	 */
	private int validInteger() {
		int value;
		do {
			Scanner s = new Scanner(System.in);
			try {
				value = Integer.parseInt(s.next());
				//Error check for Zero or negatives since they are valid values.
				if (value < 1) {
					printNonValidIntegerError();
				}
			} catch (NumberFormatException e) {
				printNonValidIntegerError();
				value = 0;
			}
		}
		while (value < 1);
		return value;
	}

	private void printNonValidIntegerError() {
		System.out.println("Not a valid integer. Please try again with a valid Integer > 0");
	}

	public int getDesiredSort(Map<Integer, String> sortMethods) {
		int userChoice;
		do {
			System.out.println("Please choose a desired sort method from below options by entering the numeric value assigned to it.");

			for (Map.Entry<Integer, String> entry : sortMethods.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			userChoice = validInteger();
		} while (!sortMethods.containsKey(userChoice));
		return userChoice;

	}
	public void printResult(int[] unsortedArray, String sortMethod ,int[] sortedArray, long timeTaken){
		System.out.println("Using unsorted array: " + Arrays.toString(unsortedArray));
		System.out.println("Using sort method: " + sortMethod);
		System.out.println("Result of sort was: " + Arrays.toString(sortedArray));
		System.out.println("Time taken was: " + timeTaken + " nanoseconds.");
	}


}

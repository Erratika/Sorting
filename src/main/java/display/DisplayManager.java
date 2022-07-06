package display;

import sorters.SortStrategy;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {

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
		System.out.println("Not a valid integer. Please try again with a valid integer > 0.");
	}

	public SortStrategy getDesiredSort() {
		SortStrategy choice;
		do {
			System.out.println("Please choose a desired sort method from below options by entering the numeric value assigned to it.");

			for (SortStrategy entry : SortStrategy.values()) {
				System.out.println(entry.getValue() + " : " + entry.getName());
			}
			choice = SortStrategy.getByValue(validInteger());
		} while ((choice != null ? choice.getValue() : 0) < 1);
		return choice;

	}
	public void printResult(int[] unsortedArray, String sortMethod ,int[] sortedArray, long timeTaken){
		System.out.println("Using unsorted array: " + Arrays.toString(unsortedArray));
		System.out.println("Using sort method: " + sortMethod);
		System.out.println("Result of sort was: " + Arrays.toString(sortedArray));
		System.out.println("Time taken was: " + timeTaken + " nanoseconds.");
	}


}

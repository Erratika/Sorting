import java.util.HashMap;
import java.util.Map;

public class SortManager {

	public void run() {
		InputOutput io = new InputOutput(this);

		Sorter sorter = null;

		Map<Integer, String> sortMethodsMap = new HashMap<>();
		sortMethodsMap.put(1, "Bubble Sort");
		while (true) {
			int userChoice = io.getDesiredSort(sortMethodsMap);
			switch (userChoice) {
				case 1:
					sorter = new BubbleSort();

			}
			if (sorter != null) {
				int desiredArrayLength = io.getDesiredArrayLength();
				int[] unsortedArray = RandomArrayGenerator.randomArray(desiredArrayLength);

				long start = System.nanoTime();
				int[] sortedArray = sorter.sortArray(unsortedArray.clone());
				long end = System.nanoTime();

				io.printResult(unsortedArray, sortMethodsMap.get(userChoice), sortedArray, end - start);
			}
		}

	}
}
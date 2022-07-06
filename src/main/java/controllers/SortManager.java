package controllers;

import display.DisplayManager;
import sorters.SortStrategy;
import sorters.Sorter;
import start.RandomArrayGenerator;
import start.SortFactory;

public class SortManager {
	private final DisplayManager view;

	public SortManager(){
		view = new DisplayManager();
	}

	public void run() {
		SortFactory sf = new SortFactory();
		SortStrategy sortStrategy;

		while (true) {
			sortStrategy = view.getDesiredSort();
			Sorter model = sf.createSorter(sortStrategy);
			if (model != null) {
				int desiredArrayLength = view.getDesiredArrayLength();
				int[] unsortedArray = RandomArrayGenerator.randomArray(desiredArrayLength);

				long start = System.nanoTime();
				int[] sortedArray = model.sortArray(unsortedArray.clone());
				long end = System.nanoTime();

				view.printResult(unsortedArray, sortStrategy.getName(), sortedArray, end - start);
			}
		}

	}
}

package controllers;

import view.DisplayManager;
import exceptions.InvalidArraySizeException;
import model.SortModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortManager {
	private final DisplayManager view;
	private final SortModel model;
	private final Logger log = LogManager.getLogger(SortManager.class);

	public SortManager(){
		view = new DisplayManager();
		model = new SortModel();
	}

	public void run() {

		while (true) {
			model.setSorter(view.getDesiredSort());
			try {
				model.generateArray(view.getDesiredArrayLength());
			}catch (InvalidArraySizeException e){
				view.printArrayOutOfBounds();
				log.error("User input an array size that was outside of reasonable bounds.");
			}
				view.printResult(model.getUnsortedArray(), model.getSortStrategy().getName(), model.sortArray(), model.getTimeTaken());

		}

	}
}

package model;

import exceptions.InvalidArraySizeException;
import model.sorts.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SortModel {
	private int[] unsortedArray;
	private Sorter sorter;
	private SortStrategy sortStrategy;
	private int[] sortedArray;

	private final SortFactory sortFactory = new SortFactory();
	private Timer timer;
	private final Logger log = LogManager.getLogger(SortModel.class);

	public int[] getUnsortedArray() {
		return unsortedArray;
	}


	public void setSorter(SortStrategy sorter) {
		try {
			this.sorter = sortFactory.createSorter(sorter);

		}catch (NullPointerException e) {
			log.error("Selected sort strategy was a null value.");
		}
	}

	public int[] sortArray(){
		timer = new Timer();
		timer.start();
		int[] sortedArray = sorter.sortArray(unsortedArray);
		timer.stop();
		return sortedArray;
	}

	public void generateArray(int size) throws InvalidArraySizeException{
		this.unsortedArray = RandomArrayGenerator.randomArray(size);

	}

	public SortStrategy getSortStrategy() {
		return sortStrategy;
	}

	public long getTimeTaken(){
		return timer.getTime();
	}
}

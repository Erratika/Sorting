package model;

import model.sorts.Sorter;

public class SortFactory {
	public Sorter createSorter(SortStrategy sortStrategy) {
		return sortStrategy.execute();
	}
}


package start;

import sorters.SortStrategy;
import sorters.Sorter;

public class SortFactory {
	public Sorter createSorter(SortStrategy sortStrategy) {
		return sortStrategy.execute();
	}
}


package sorters;

public enum SortStrategy {
	BUBBLE_SORT(1, "Bubble Sort") {
		@Override
		public Sorter execute() {
			return new BubbleSort();

		}
	},
	MERGE_SORT(2, "Merge Sort") {
		@Override
		public Sorter execute() {
			return new MergeSort();

		}
	},
	BINARY_SORT(3, "Binary Sort") {
		@Override
		public Sorter execute() {
			return new BinarySort();

		}
	},
	INSERTION_SORT(4, "Insertion Sort") {
		@Override
		public Sorter execute() {
			return new InsertionSort();

		}
	},
	QUICK_SORT(5, "Quick Sort") {
		@Override
		public Sorter execute() {
			return new QuickSort();

		}
	};
	private final int value;
	private final String name;

	SortStrategy(int value, String name) {
		this.value = value;
		this.name = name;

	}

	public abstract Sorter execute();

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public static SortStrategy getByValue(int i) {
		for (SortStrategy e : values()) {
			if (e.value == i) {
				return e;
			}
		}
		return null;
	}
}



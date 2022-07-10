package model.sorts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import model.binaryTree.BinaryTree;

public class BinarySort implements Sorter{
	private static final Logger log = LogManager.getLogger(BinarySort.class);
	@Override
	public int[] sortArray(int[] arrayToSort) {
		try {
			BinaryTree b = new BinaryTree(arrayToSort[0]);
			for (int value: arrayToSort ) {
				b.insert(b.getRoot(),value);
			}
			return b.inOrder(b.getRoot()).stream().mapToInt(i-> i).toArray();

		}catch (IndexOutOfBoundsException e){
			log.error("Array to sort was empty.");
			return new int[0];
		}

	}

}

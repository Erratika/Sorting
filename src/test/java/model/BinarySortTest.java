package model;

import model.sorts.BinarySort;
import model.sorts.Sorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySortTest {
	private Sorter sorter;
	@BeforeEach
	void setup(){
		sorter = new BinarySort();
	}

	@Test
	void testSort(){
		int[] testArray = {76,20,34,9,0,-4};
		int[] expected = {-4,0,9,20,34,76};
		assertArrayEquals(expected,sorter.sortArray(testArray));
	}
	@Test
	void testSortEmpty(){
		int[] testArray = new int[0];
		int[] expected = {};
		assertArrayEquals(expected,sorter.sortArray(testArray));
	}
	@Test
	void testSortDuplicates(){
		int[] testArray = {0,4,4,6,3,4,6,1};
		int[] expected = {0,1,3,4,4,4,6,6};
		assertArrayEquals(expected,sorter.sortArray(testArray));
	}

}
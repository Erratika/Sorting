package model;

import model.sorts.MergeSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
	private MergeSort sorter;

	@BeforeEach
	public void setup(){
		sorter = new MergeSort();
	}

	@Test
	void testMerge(){
		int[] testArray1 = {0,20,34};
		int[] testArray2 = {-4,9,76};
		int[] expected = {-4,0,9,20,34,76};
		//assertArrayEquals(expected,sorter.merge(testArray1,testArray2));
	}
	@Test
	void testMergeSameValues(){
		int[] testArray1 = {0,0,0};
		int[] testArray2 = {0,0,0};
		int[] expected = {0,0,0,0,0,0};
		//assertArrayEquals(expected,sorter.merge(testArray1,testArray2));
	}
	@Test
	void testMergeDifLength(){
		int[] testArray1 = {0,20};
		int[] testArray2 = {-4,9,76};
		int[] expected = {-4,0,9,20,76};
		//assertArrayEquals(expected,sorter.merge(testArray1,testArray2));
	}

	@Test
	void testSort(){
		int[] testArray = {76,20,34,9,0,-4};
		int[] expected = {-4,0,9,20,34,76};
		assertArrayEquals(expected,sorter.sortArray(testArray));
	}
}
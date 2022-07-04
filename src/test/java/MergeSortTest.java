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
	void testSort(){
		int[] testArray1 = {0,20,34};
		int[] testArray2 = {-4,9,76};
		int[] expected = {-4,0,9,20,34,76};
		assertArrayEquals(expected,sorter.sort(testArray1,testArray2));
	}
}
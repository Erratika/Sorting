package sorters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sorters.BubbleSort;
import sorters.Sorter;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private Sorter sorter;
    @BeforeEach
    void setup(){
        sorter = new BubbleSort();
    }

    @Test
    void testSort(){
        int[] testArray = {76,20,34,9,0,-4};
        int[] expected = {-4,0,9,20,34,76};
        assertArrayEquals(expected,sorter.sortArray(testArray));
    }

}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testSort(){
        int[] testArray = {76,20,34,9,0,-4};
        int[] expected = {-4,0,9,20,34,76};
        BubbleSort b = new BubbleSort();
        assertArrayEquals(expected,b.sortArray(testArray));
    }

}
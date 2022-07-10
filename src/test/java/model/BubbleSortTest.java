package model;

import model.sorts.BubbleSort;
import model.sorts.Sorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    @Test
    void testSortEmpty(){
        int[] testArray = new int[0];
        int[] expected = {};
        assertArrayEquals(expected,sorter.sortArray(testArray));
    }

}
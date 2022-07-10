package model.sorts;

import java.util.Arrays;

public class MergeSort implements Sorter {
	void merge(int[] array, int left, int middle, int right)
	{
		int[] leftArray  = new int[middle - left + 1];
		int[] rightArray = new int[right - middle];

		// fill in left array
		for (int i = 0; i < leftArray.length; ++i)
			leftArray[i] = array[left + i];

		// fill in right array
		for (int i = 0; i < rightArray.length; ++i)
			rightArray[i] = array[middle + 1 + i];

		int leftIndex = 0, rightIndex = 0;

		int currentIndex = left;

		while (leftIndex < leftArray.length && rightIndex < rightArray.length)
		{
			if (leftArray[leftIndex] <= rightArray[rightIndex])
			{
				array[currentIndex] = leftArray[leftIndex++];
			}
			else
			{
				array[currentIndex] = rightArray[rightIndex++];
			}
			currentIndex++;
		}

		while (leftIndex < leftArray.length) array[currentIndex++] = leftArray[leftIndex++];

		while (rightIndex < rightArray.length) array[currentIndex++] = rightArray[rightIndex++];
	}

	void mergeSort(int[] array, int left, int right)
	{
		if (left < right)
		{
			// Find the middle point
			int middle = (left+right)/2;

			// Sort first and second halves
			mergeSort(array, left, middle);
			mergeSort(array , middle+1, right);

			// Merge the sorted halves
			merge(array, left, middle, right);
		}
	}

	@Override
	public int[] sortArray(int[] arrayToSort) {
		mergeSort(arrayToSort,0,arrayToSort.length-1);
		return arrayToSort;
	}
}

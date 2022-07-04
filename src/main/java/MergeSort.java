public class MergeSort {
	public int[] sort(int[] array1, int[] array2){
		int array1Length = array1.length;
		int array2Length = array2.length;

		int array1Pos =0;
		int array2Pos =0;
		int mergeArrayPos =0;

		int [] mergedArray = new int[array1Length + array2Length];
		while (array1Pos< array1Length && array2Pos< array2Length){
			if (array1[array1Pos] < array2[array2Pos]){
				mergedArray[mergeArrayPos++] = array1[array1Pos++];
			}else {
				mergedArray[mergeArrayPos++] = array2[array2Pos++];
			}
		}
		while(array1Pos<array1Length){
			mergedArray[mergeArrayPos++] = array1[array1Pos++];
		}
		while (array2Pos<array2Length){
			mergedArray[mergeArrayPos++] = array2[array2Pos++];
		}
		return mergedArray;




	}
}

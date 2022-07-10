package model;

import exceptions.InvalidArraySizeException;

import java.util.Random;
public class RandomArrayGenerator {

    /**
     *
     * @param arrayLength
     * @return a new array of Randomly generated integers with size = arrayLength
     * @throws InvalidArraySizeException when arrayLength is out of bounds of 1 >= arrayLength <=100
     */
    public static int[] randomArray(int arrayLength) throws InvalidArraySizeException {
        Random r = new Random();
        if (arrayLength>=0 && arrayLength<=100) {
            int[] newArray = new int[arrayLength];
            for (int x = 0; x < arrayLength; x++) {
                newArray[x] = r.nextInt();
            }
            return newArray;
        }
        throw new InvalidArraySizeException();
    }
}

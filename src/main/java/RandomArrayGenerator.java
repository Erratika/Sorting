import java.util.Random;
public class RandomArrayGenerator {

    public static int[] randomArray(int arrayLength){
        Random r = new Random();
        int[] newArray = new int[arrayLength];
        for (int x =0; x < arrayLength;x++){
            newArray[x] = r.nextInt();

        }
        return newArray;
    }
}

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithms {

    public static void populateArray(int[] intArray) {
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            int randomInt = random.nextInt(100) + 1;
            intArray[i] = randomInt;
        }
    }
    public static void selectionSort(int[] intArray) {
        int currentLow, temp;
        for (int e = 0; e < intArray.length; e++) {
            currentLow = e;
            for(int i = e ; i < intArray.length; i++) {
                if(intArray[currentLow] > intArray[i]) {
                    currentLow = i;
                }
            }
            temp = intArray[e];
            intArray[e] = intArray[currentLow];
            intArray[currentLow] = temp;
        }
    }
    public static void main(String[] args) {
        int[] intArray = new int[10];
        populateArray(intArray);
        System.out.println(Arrays.toString(intArray));
        selectionSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }


}

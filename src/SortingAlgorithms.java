import java.util.Random;
public class SortingAlgorithms {
    private static int[] array = new int[10];
    public static void selectionSort() {
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] > array[k]) {
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        selectionSort();
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

import java.util.Arrays;

/**
 * @author Olivia McKittrick
 * &#064;date  12/4/23
 */

public class SortingAlgorithms {

    public static void main(String[] args) { // Prints original and sorted array
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Original Array: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        int i;
        for (i = 0; i < n - 1; i++) {
            // find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            //Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

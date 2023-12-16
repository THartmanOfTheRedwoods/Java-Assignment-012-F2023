public class SortingAlgorithms {
    // method to find the index of the lowest element
    private static int indexLowest(int[] arr, int start) {
        int minIndex = start;
        /* loop that uses the array to find the lowest index while comparing it to the array itself */
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    //  method to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Selection Sort algorithm
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of the lowest element
            int minIndex = indexLowest(arr, i);

            // Swaps the ith element and the lowest element found
            swap(arr, i, minIndex);
        }
    }
}

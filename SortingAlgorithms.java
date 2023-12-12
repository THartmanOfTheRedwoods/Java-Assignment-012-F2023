//NAQIBULLAH HAIWADPAL
//12/11/2023

public class SortingAlgorithms {

    // Method to perform selection sort on an integer array
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Utility method to print the array elements
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method for testing the selectionSort function
    public static void main(String[] args) {
        int[] myArray = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(myArray);

        selectionSort(myArray);

        System.out.println("Sorted array:");
        printArray(myArray);
    }
}

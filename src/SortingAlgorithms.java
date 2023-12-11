public class SortingAlgorithms {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    public static void main(String[] args) {

        int[] myArray = {4, 2, 3, 1, 0};


        System.out.print("Original Array: ");
        printArray(myArray);
        selectionSort(myArray);
        System.out.print("Sorted Array: ");
        printArray(myArray);
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

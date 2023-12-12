public class SortingAlgorithms {
        public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Find the index of the minimum element in the unsorted part of the array
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element in the unsorted part
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }


        public static void main(String[] args) {
            // Example array
            int[] unsortedArray = {64, 25, 12, 22, 11, 2, 6};


            selectionSort(unsortedArray);


            System.out.print("Sorted Array: ");
            for (int num : unsortedArray) {
                System.out.print(num + " ");
            }
        }
    }



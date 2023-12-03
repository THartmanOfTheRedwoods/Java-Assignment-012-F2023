// Daniel Faulkner CIS 12, 12/2/2023
public class SortingAlgorithms {
    void selectionSort(int arr[]) {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }

            if (pos != i) {
                temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }
        }
    }

    void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        SortingAlgorithms ob = new SortingAlgorithms();
        int arr[] = {64, 25, 12, 22, 11};
        ob.selectionSort(arr);
        ob.display(arr);
    }
}



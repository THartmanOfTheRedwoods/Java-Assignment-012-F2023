/*
*
* @author Trevor Hartman
* @author Angelina Perez
 */

import java.util.Random;
public class SortingAlgorithms {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i < n - 1; i++) {
            int min = i;
            for (int j=i+1;j<n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[]args) {
        Random random = new Random();
        int[]arr = new int[10];
        for (int i = 0; i<arr.length;i++) {
            arr[i]=random.nextInt(100);
        }
        selectionSort(arr);
        System.out.println("Sorted array:");
        for(int num:arr) {
            System.out.println(num + "");
        }
    }
}

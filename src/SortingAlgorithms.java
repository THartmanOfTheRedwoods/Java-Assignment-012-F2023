import java.util.Random;
import java.util.Scanner;
public class SortingAlgorithms {
    static Scanner s = new Scanner(System.in);

    static int[] intArray;
    static Random r = new Random();
    public static void assign(int entered) {
        intArray = new int[entered];
        for (int i = 0; i < intArray.length;i++){
            intArray[i] = r.nextInt(0, 100);

        }
    }

   public static int compare( int start){
    int lessThan = intArray[start];

        while (true) {
    int h = 1;
    while (lessThan <= intArray[(start + h)]) {

        if ((start+h) == intArray.length-1){
            return lessThan;
        }
        h++;
    }

    lessThan = intArray[(start + h)];

        }

    }

    /**
    Find the lowest integer method
     */
    static int x = 0;
    /**public static int find(int startAgain) {
        int helper = 0;

//Compare integers method?
        //while (x< intArray.length){
        helper = compare(startAgain);
        // if (helper ==0 || helper == intArray[x]){
        // x++;
        //  System.out.println(helper);
    //}
        return helper;
        }
*/
    /**
     * Swaps the lowest integer with the ith place
     */
    public static void swap(int u){
        int helper1 = intArray[u];
        int helper2 = compare(u);

        int w = u;
        while (w<intArray.length){
        if (helper2 == intArray[w]){
            intArray[w] = helper1;
        } w++;}
        intArray[u] = helper2;


    }

    /**
     * int helper = numbers[0];
     * numbers[0] = numbers[1];
     * numbers[1] = helper;
     */
    public static void printArray(){
    System.out.println();
    for (int i = 0; i< intArray.length; i++){
        System.out.println((i+1) + ": " + intArray[i]);
    }
}

    public static void selectionSort(){
        for (int x=0; x<=intArray.length-2; x++) {
            //find the lowest integer at or to the right of i. A METHOD
            //swap the ith place with the lowest integer found. A METHOD
            swap(x);

        }


    }


    public static void main(String[]args){

        SortingAlgorithms SA = new SortingAlgorithms();
        System.out.println("Enter the length of list you would like created and sorted from lowest to highest.");
        int qwerty = s.nextInt();
        SA.assign(qwerty);
printArray();
        selectionSort();
        printArray();


    }
}

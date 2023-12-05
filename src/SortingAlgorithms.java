import java.util.ArrayList;
import java.util.Scanner;

public class SortingAlgorithms {
    private ArrayList<Integer> list;
    private static int lowestInt;
    public SortingAlgorithms(){
        this.list = list;
    }
    public ArrayList<Integer> makeArray() {
        Scanner scan = new Scanner(System.in);
        list = new ArrayList<>();
        int a;
        System.out.println("Enter an integer:");
        while (scan.hasNextInt()) {
            a = scan.nextInt();
            list.add(a);
            System.out.println("Enter another integer or \"q\" to quit");
            if (scan.nextLine().equals("q")) {
                break;
            }
        }return list;
    }
    public static void selectionSort(ArrayList<Integer> list){
        int s = list.size();
        for (int i = 0; i < s - 1; i++){
            lowestInt = i;
            for (int l = i + 1; l < s; l++){
                if (list.get(l) < list.get(lowestInt)){
                    lowestInt = l;
                }
            }
            int temp = list.get(lowestInt);
            list.set(lowestInt, list.get(i));
            list.set(i, temp);
        }
    }
    public void printArray(){
        System.out.print("{");
        for(Integer integer : list){
            System.out.print(integer + ", ");
        }
        System.out.print("}");
    }
    public static void main(String[] args){
        SortingAlgorithms sa = new SortingAlgorithms();
        sa.makeArray();
        sa.printArray();
        selectionSort(sa.list);
        System.out.println();
        sa.printArray();
    }
}

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
        for (a = 0; a < list.indexOf(5); a++){
            a = scan.nextInt();
            list.add(a);
            System.out.println("Enter another integer or \"q\" to quit");
            if (scan.nextLine().equals("q")){
                break;
            }
        }return list;
    }
    public static void selectionSort(ArrayList<Integer> list){
        for (int i = 0; i < 6 - 1; i++){
            lowestInt = i;
            for (int l = i + 1; l < 6; l++){
                if (list.get(l) < list.get(6)){
                    lowestInt = l;
                }
            }
            int low = list.get(lowestInt);
            int med = list.get(i);
            int temp = low;
            low = med;
            med = list.get(temp);
        }
    }
    public void printArray(){
        System.out.print("{");
        System.out.print(list.get(0));
        for(Integer integer : list){
            System.out.print(", " + integer);
        }
        System.out.print("}");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        SortingAlgorithms sa = new SortingAlgorithms();
        sa.makeArray();
        sa.printArray();
    }
}

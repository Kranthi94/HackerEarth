import java.util.ArrayList;

public class TowersOfHanoi {

    private static ArrayList<Integer> startPeg = new ArrayList<>();

    private static ArrayList<Integer> middlePeg = new ArrayList<>();

    private static ArrayList<Integer> endPeg = new ArrayList<>();

    private static int j = 0;

    public static void main(String[] args){

        initializeArrayList(9);

        moveTowers(j, startPeg, middlePeg, endPeg);

        displayElements(endPeg);
    }

    private static void moveTowers(int noOfTowers, ArrayList<Integer> start, ArrayList<Integer> middle, ArrayList<Integer> end){

        if(noOfTowers == 1){

            j--;

            if(j >= 0){
                endPeg.add(endPeg.size(), j);
            }
        }else {
            moveTowers(noOfTowers - 1, start, end, middle);
            moveTowers(1, start, middle, end);
            moveTowers(noOfTowers - 1, middle, start, end);
        }
    }

    private static void initializeArrayList(int size){

        j = size;

        for (int i = 0; i < j; i++) {
            startPeg.add(i, i);
        }
    }

    private static void displayElements(ArrayList<Integer> arrayList){
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}

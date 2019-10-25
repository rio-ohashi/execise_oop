package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WhereIsIt {
    public static void main(String[] args) {
        final int MAX_ITEM = 10;
        final int MAX_RANGE = 50;

        List<Integer> randomeNumsList = new ArrayList<>();

        int[] randomNums = new Random().ints(MAX_ITEM, 0, MAX_RANGE).toArray();
        Arrays.stream(randomNums).forEach(i->randomeNumsList.add(i));
        int randomNum = new Random().nextInt(MAX_RANGE);

        String printNums = "";
        for (int j=0;j<MAX_ITEM;j++) {
            printNums += randomeNumsList.get(j) + " ";
        }
        System.out.println(String.format("ArrayList: [%s]", printNums));
        System.out.println(String.format("Value to find: %d", randomNum));

        for (int i=0;i<MAX_ITEM;i++) {
            if (randomeNumsList.get(i) == randomNum) {
                System.out.print(String.format("\n%d is in the ArrayList.", randomNum));
            }
        }
    }
}

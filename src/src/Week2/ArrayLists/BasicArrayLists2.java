package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
    final int MAX_ITEM = 10;
    final int MAX_RANGE = 100;

    List<Integer> randomeNumsList = new ArrayList<>();

    int[] randomNums = new Random().ints(MAX_ITEM, 0, MAX_RANGE).toArray();
        Arrays.stream(randomNums).forEach(i->randomeNumsList.add(i));

        String printNums = "";
        for (int j=0;j<MAX_ITEM;j++) {
            printNums += randomeNumsList.get(j) + " ";
        }
        System.out.println(String.format("ArrayList: [%s]", printNums));

    }
}

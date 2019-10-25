package Week2.Arrays;

import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        final int MAX_ITEM = 10;
        final int MAX_RANGE = 50;

        int[] randomNums = new Random().ints(MAX_ITEM, 0, MAX_RANGE).toArray();

        String printNums = "";
        for (int j=0;j<MAX_ITEM;j++) {
            printNums += randomNums[j] + " ";
        }
        System.out.println(String.format("Array: %s", printNums));

        int max = 0;
        for (int i=0;i<MAX_ITEM;i++) {
            if (randomNums[i] > max) {
                max = randomNums[i];
            }
        }
        System.out.println(String.format("The largest value is %d", max));
    }
}

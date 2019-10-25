package Week2.Arrays;

import java.util.Random;

public class FindingTheLargestValue {

    public static void main(String[] args) {
        final int MAX_ITEM = 10;
        final int MAX_RANGE = 100;

        int[] randomNums = new Random().ints(MAX_ITEM, 0, MAX_RANGE).toArray();

        String printNums = "";
        for (int j=0;j<MAX_ITEM;j++) {
            printNums += randomNums[j] + " ";
        }
        System.out.println(String.format("Array: %s", printNums));

        int max = 0;
        int maxIndex = 0;
        for (int i=0;i<MAX_ITEM;i++) {
            if (randomNums[i] > max) {
                max = randomNums[i];
                maxIndex = i;
            }
        }
        System.out.println(String.format("\nThe largest value is %d", max));
        System.out.println(String.format("It is in slot %d", maxIndex));
    }
}

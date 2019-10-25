package Week2.Arrays;

import java.util.Random;

public class WhereIsIt {
    public static void main(String[] args) {
        final int MAX_ITEM = 10;
        final int MAX_RANGE = 50;

        int[] randomNums = new Random().ints(MAX_ITEM, 0, MAX_RANGE).toArray();
        int randomNum = new Random().nextInt(MAX_RANGE);

        String printNums = "";
        for (int j=0;j<MAX_ITEM;j++) {
            printNums += randomNums[j] + " ";
        }
        System.out.println(String.format("Array: %s", printNums));
        System.out.println(String.format("Value to find:  %d", randomNum));

        boolean isFind = false;
        for (int i=0;i<MAX_ITEM;i++) {
            if (randomNums[i] == randomNum) {
                isFind = true;
                System.out.print(String.format("\n%d is in slot %d", randomNum, i));
            }
        }
        if (!isFind) {
            System.out.print(String.format("\n%d is not in the array", randomNum));
        }
    }
}

package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class CopyingArrays {

    public static void main(String[] args) {
        final int MAX_NUM = 10;
        int[] randomNums = new Random().ints(MAX_NUM, 0, 100).toArray();
        int[] copyNums = randomNums.clone();

        randomNums[randomNums.length-1] = -7;

        String printNums = "";
        for (int j=0;j<MAX_NUM;j++) {
            printNums += randomNums[j] + " ";
        }
        System.out.println(String.format("Array %d: %s", 1, printNums));
        printNums = "";
        for (int j=0;j<MAX_NUM;j++) {
            printNums += copyNums[j] + " ";
        }
        System.out.println(String.format("Array %d: %s", 2, printNums));
    }
}
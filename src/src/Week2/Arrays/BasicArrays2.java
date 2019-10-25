package Week2.Arrays;

import java.util.Random;
import java.util.stream.IntStream;

public class BasicArrays2 {
    public static void main(String[] args) {
        final int MAX_ITEM = 10;
        final int MAX_RANGE = 100;
        int[] randomNums = new Random().ints(MAX_ITEM, 0, MAX_RANGE).toArray();

        IntStream.range(0, randomNums.length).forEach(i -> {
            System.out.println(String.format("Slot %d contains a %d", i, randomNums[i]));
        });
    }
}

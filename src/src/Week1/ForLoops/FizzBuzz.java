package Week1.ForLoops;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        IntStream.range(1, 101).forEach(i -> {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(String.format("%d", i));
            }
        });
    }
}

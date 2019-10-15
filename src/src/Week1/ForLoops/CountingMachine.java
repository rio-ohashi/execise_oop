package Week1.ForLoops;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CountingMachine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Count to:");

        Optional<Integer> input_num = Optional.ofNullable(input.nextInt());
        IntStream.range(0,input_num.orElse(0) + 1).forEach(i->{
            System.out.print(i + " ");
        });
    }

}

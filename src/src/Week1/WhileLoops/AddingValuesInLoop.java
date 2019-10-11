package Week1.WhileLoops;

import java.util.Optional;
import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(String.format("I will add up the numbers you give me."));

        int num_input = (input.nextInt());
        int num_sum = 0;

        while (num_input != 0) {
            num_sum += num_input;
            System.out.println(String.format("The total so far is %d", num_sum));
            num_input = (input.nextInt());
        }

        System.out.println(String.format("The total is %d", num_sum));

    }
}

package Week1.KeyboardInput;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(String.format("Hello.  What is your name?"));

        Optional<String> name = Optional.ofNullable(input.nextLine());
        System.out.println(String.format("Hi, %s!  How old are you?", name.orElse("John")));

        Optional<Integer> age = Optional.ofNullable(input.nextInt());
        System.out.println(String.format("So you're %d, eh?  That's not old at all!\nHow much do you make, %s?", age.orElse(0), name.orElse("John")));

        Optional<Float> salary = Optional.ofNullable(input.nextFloat());
        System.out.println(String.format("%.1f!  I hope that's per hour and not per year! LOL!", salary.orElse(0.0f)));
    }
}

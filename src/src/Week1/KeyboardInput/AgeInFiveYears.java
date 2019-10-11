package Week1.KeyboardInput;

import java.util.Optional;
import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(String.format("Hello.  What is your name"));

        Optional<String> name = Optional.ofNullable(input.nextLine());
        System.out.println(String.format("Hi, %s!  How old are you?", name.orElse("John")));

        Optional<Integer> age = Optional.ofNullable(input.nextInt());
        System.out.println(String.format("Did you know that in five years you will be %d years old?\n" +
                "And five years ago you were %d! Imagine that!", age.orElse(0) + 5, age.orElse(0) - 5));
    }
}

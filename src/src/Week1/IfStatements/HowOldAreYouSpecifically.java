package Week1.IfStatements;

import java.util.Optional;
import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(String.format("Hey, what's your name? (Sorry, I keep forgetting.)"));

        Optional<String> name = Optional.ofNullable(input.nextLine());
        System.out.println(String.format("Ok, %s, how old are you?", name.orElse("John")));

        Optional<Integer> input_age = Optional.ofNullable(input.nextInt());

        int age = input_age.orElse(0);
        if (age < 15) {
            System.out.println("You can't drive.");
        } else if (age < 18) {
            System.out.println("You can drive but not vote.");
        } else if (age < 25) {
            System.out.println("You can vote but not rent a car.");
        } else {
            System.out.println("You can do pretty much anything.");
        }
    }
}
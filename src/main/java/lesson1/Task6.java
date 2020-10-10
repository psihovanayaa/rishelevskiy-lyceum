package lesson1;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, how are you?");

        String input = sc.nextLine();

        System.out.println("Are you really - " + input + "?");
        System.out.println("Ok, so how old are you?");

        int amountYears = sc.nextInt();
        amountYears = amountYears + 1;
        System.out.println("You will have " + amountYears + " in next year.");

    }
}

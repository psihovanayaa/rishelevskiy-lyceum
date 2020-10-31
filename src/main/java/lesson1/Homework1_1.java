package lesson1;

import java.util.Scanner;

public class Homework1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько лет вашей собаке?");
        int years = sc.nextInt();
        System.out.println("Сколько лет вы хотите прибавить?");
        int future = sc.nextInt();
        int future_years = years + future;
        if (future_years<5){
            if (future_years==1){
                System.out.println("Ему и 5 лет даже нету – ему всего лишь 1 годик");
            }
            else{
                System.out.printf("Ему и 5 лет даже нету – ему всего лишь %d годика%n", future_years);
            }
        }
        else{
            System.out.printf("Через %d лет вашей собаке будет %d лет.%n", future, future_years);
        }
    }
}
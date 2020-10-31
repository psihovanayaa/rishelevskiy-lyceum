package lesson1;

import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        float l = sc.nextFloat();
        System.out.printf("S = %f%n", Math.PI*Math.pow(l, 2));
    }

}
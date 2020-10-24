package lesson2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
            System.out.println(i++);
        }

        while (i < 50000) {
            System.out.println(i = i * 15);
        }

        do {
            System.out.println(i = i * 15);
        } while (i < 0);

        // сделать цикл при котором приложение закончит свою работу только тогда, когда пользователь ведёт слово stop



    }
}

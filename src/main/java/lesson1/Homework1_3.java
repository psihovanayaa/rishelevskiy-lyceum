package lesson1;

import java.util.Scanner;

public class Homework1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите  b если вы парень или g – если девушка, или n – если вы не уверены кто вы вообще, или p - если вы программист.");
        String s = sc.nextLine();
        switch (s) {
            case "b" -> System.out.println("Ну здорова, приятель");
            case "g" -> System.out.println("Когда я вижу как ты верстаешь, малыш, ты меня пугаешь.");
            case "n" -> System.out.println("Добрый день");
            default -> System.out.println("Вы точно человек?");
        }
    }
}

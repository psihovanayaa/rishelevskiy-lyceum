package lesson1;

public class Task8 {

    public static void main(String[] args) {
// % - остаток от деления
// целочисленные типы
        byte b;
        b = 8 % 5; // b = 3
        b = 8 % 4; // b = 0

        int a;
        a = 15;
        b = (byte) (8 % a); // b = 8

// вещественные типы
        float f1, f2;
        double d;

        f1 = 3.5f;
        f2 = 10.0f;
        d = f1 % f2; // d = 3.5

        f2 = 0.5f;
        d = f1 % f2; // d = 0.0

        f2 = 1.2f;
        d = f1 % f2; // d = 1.1

// целочисленные и вещественные типы
        int x = 5;
        float ff = 3.5f;
        double dd;
        dd = x % ff; // dd = 1.5
    }
}

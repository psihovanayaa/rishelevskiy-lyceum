package lesson1;

public class Task9 {
    public static void main(String[] args) {
// инкремент '++', декремент '--'
// целочисленные типы
        int a, b;
        a = -6;
        b = a++; // b = -6; a = -5

        a = -6;
        b = ++a; // b = -5; a = -5

        a = 3;
        b = a--; // b = 3; a = 2

        a = 3;
        b = --a; // b = 2; a = 2

// вещественные типы
        float f;
        double d;
        f = 5.7f;
        d = ++f; // d = 6.7; f = 6.7
    }
}

package lesson1;

public class Task10 {
    public static void main(String[] args) {
// целочисленные типы
        int a;

        a = 7;
        a += 8; // a = a + 8 = 15

        a = -3;
        a -= 5; // a = a - 5 = -3 - 5 = -8

        a = 10;
        a *= 3; // a = 30

        a = 20;
        a /= 5; // a = 4

        a = 30;
        a %= 7; // a = 30 % 7 = 2

// вещественные типы
        float f;

        f = 3.5f;
        f += 2 * f; // f = f + 2*3.5 = 10.5

        f = -8.0f;
        f -= f;  // f = f - f = 0.0

        f = 6.5f;
        f %= 2; // f = 0.5
    }
}

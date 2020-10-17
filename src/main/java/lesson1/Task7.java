package lesson1;

public class Task7 {

    public static void main(String[] args) {
// арифметические операции '+', '-', '*', '/'
// целочисленные типы
        int a, b;
        long l;
        a = 8;
        b = -5;

        l = a + b; // l = 3
        l = a - b; // l = 13
        l = a * b; // l = -40
        l = a / b; // l = -1 - деление нацело

// вещественные типы
        float f1, f2;
        double d;

        f1 = 3.5f;
        f2 = 10.0f;
        d = f1 + f2; // d = 13.5
        d = f1 - f2; // d = -6.5
        d = f1 * f2; // d = 35.0
        d = f1 / f2; // d = 0.3499999940395355

// целочисленные и вещественные типы
        a = 5;
        f1 = 3.2f;
        d = a * f1; // d = 16.0
        d = a + f1; // d = 8.199999809265137
        d = a - f1; // d = 1.7999999523162842
        d = a / f1; // d = 1.5625

// тип char
        char c = 'A';
        c = (char) (c + 1); // c = 'B'
        int code;
        code = (int) (c + 1); // code = 67

    }
}

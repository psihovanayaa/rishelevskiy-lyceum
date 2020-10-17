package lesson1;

public class Task12 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int a = ++x + y * z;
        //В консоли будет 8.
        System.out.println(a);


        x = 7;
        y = 3;
        z = 2;

        a = x % y * z;
        //В консоли видим 2.
        System.out.println(a);
    }
}

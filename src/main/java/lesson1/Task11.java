package lesson1;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1));      // 1
        System.out.println(Math.abs(-21.8d));  // 21.8
        System.out.println(Math.abs(4532L));   // 4532
        System.out.println(Math.abs(5.341f));  // 5.341

        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.cos(Math.toRadians(0)));


        System.out.println(Math.pow(1,3)); // 1.0
        System.out.println(Math.pow(2,3)); // 8.0


        System.out.println(Math.sqrt(16));  // 4.0
        System.out.println(Math.cbrt(8));   // 2.0

        System.out.println(Math.random());
    }
}

package lesson2;

public class Task6 {

    public static void main(String[] args) {

        int i = 5;
        switch(i) {
            case 5: System.out.println("i equal to 5");
            case 10: System.out.println("i equal to 10");
            case 132: System.out.println("i equal to 132");
            default: System.out.println("i equal to " + i);
        }

        int j = 5;
        switch(j) {
            case 5: System.out.println("j equal to 5"); break;
            case 10: System.out.println("j equal to 10"); break;
            case 132: System.out.println("j equal to 132"); break;
            default: System.out.println("i equal to " + i);
        }

        int k = 5;
        switch(k) {
            case 0:
            case 1:
            case 2:
            case 3: System.out.println("k less than 3"); break;
            case 4: System.out.println("k equal to 4"); break;
            case 5:
            case 6:
            case 7: System.out.println("k bigger than 4"); break;
            default: System.out.println("k equal to " + i);
        }
    }
}

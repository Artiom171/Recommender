import java.util.*;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Apklausos imitavymas");
        System.out.println();
        System.out.println("Pasirinkite amziaus grupe");
        System.out.println("1 -> 14-18m.");
        System.out.println("2 -> 18-25m.");
        System.out.println("3 -> 25-33m.");
        System.out.println("4 -> 33-45m.");
        System.out.println("5 -> 45m ir daugiau");
        int age = scan.nextInt();


        System.out.println();
        System.out.println("Pasirinkite lyti");
        System.out.println("1 -> Vyras");
        System.out.println("2 -> Moteris");
        int gender = scan.nextInt();

        System.out.println();
        try {
            ProductHelper.ProductHelper(age, gender);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}

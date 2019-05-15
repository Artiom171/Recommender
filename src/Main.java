import java.util.*;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Poll imitation");
        System.out.println("Input 0 to exit");

        Scanner inAge = new Scanner(System.in);
        System.out.println();
        System.out.println("Input your age");
        int age = inAge.nextInt();
        if(age == 0){
            exit();
        }
        Scanner inGender = new Scanner(System.in);

        System.out.println();
        System.out.println("You belong to men or women?(input the answer:)");
        String gender = inGender.nextLine();
        gender.toLowerCase();

        System.out.println();
        try {
            ProductHelper.ProductHelper(age, gender);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public static void exit(){
        System.out.println("Thank you for working with our program! Press Enter");
        System.exit(0);
    }

}

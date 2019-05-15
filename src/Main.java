import java.util.*;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Testuojame duomenys is apklausos, vertinant populiaruma(reitinga) ir tai, kam yra naudojimas produktas is apklausos");
        System.out.println();
        System.out.println("Pasirinkite pirma preke");
        System.out.println("1 - Televizorius PHILIPS 49PUS6412/12. 3840 x 2160 (4K UHD)");
        System.out.println("2 - Šaldytuvas SAMSUNG RB33J3205SA/EF");
        System.out.println("3 - Šerloko Holmso kolekciją");
        System.out.println("0 - Baigti darba");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println();
        if(choice == 0){

        } else {
            try {
                ProductHelper.ProductHelper(choice);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

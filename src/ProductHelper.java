import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class ProductHelper {
    public static List<Product> firstProducts = new ArrayList<>();
    public static List<SecProduct> secondProductsTV = new ArrayList<>();
    public static List<SecProduct> secondProductsFridge = new ArrayList<>();
    public static List<SecProduct> secondProductsBook = new ArrayList<>();

    public static void ProductHelper(int age, String gender) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        Product TV = new Product("electronics", "Televizorius PHILIPS 49PUS6412/12. 3840 x 2160 (4K UHD)", "entertainment-tv", 1499.99);
        Product fridge = new Product("domestic", "Šaldytuvas SAMSUNG RB33J3205SA/EF", "kitchen", 789.99);
        Product book = new Product("other", "Šerloko Holmso kolekciją", "entertainment-konwlegde", 15.99);

        firstProducts.add(TV);
        firstProducts.add(fridge);
        firstProducts.add(book);
//        was not in the poll
//        secondProductsTV.add(new SecProduct(TV, "electronics", "Lenovo Legion Y530-15ICH nešiojamas kompiuteris", 17,
//                "entertainment-gaming-work", 1999.99, "non", 14, 45));
//        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Lenovo Legion Y530-15ICH nešiojamas kompiuteris",7,
//                "entertainment-gaming-work", 1999.9, "non", 14, 45));
//        secondProductsBook.add(new SecProduct(book, "electronics", "Lenovo Legion Y530-15ICH nešiojamas kompiuteris",8,
//                "entertainment-gaming-work", 1999.9, "non", 14, 45));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Kavos virimo aparatas DELONGHI DOLCE GUSTO Colors EDG355.B", 17,
                "kitchen", 799.99, "non", 14, 33));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Kavos virimo aparatas DELONGHI DOLCE GUSTO Colors EDG355.B", 7,
                "kitchen", 799.99, "non", 14, 33));
        secondProductsBook.add(new SecProduct(book, "domestic", "Kavos virimo aparatas DELONGHI DOLCE GUSTO Colors EDG355.B", 8,
                "kitchen", 799.9, "non", 14, 33));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Skalbimo mašina SAMSUNG WW90M760NOA/LE QuickDrive",12,
                "needs", 450.99, "women", 25, 99));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Skalbimo mašina SAMSUNG WW90M760NOA/LE QuickDrive",12,
                "needs", 450.99, "women", 25, 99));
        secondProductsBook.add(new SecProduct(book, "domestic", "Skalbimo mašina SAMSUNG WW90M760NOA/LE QuickDrive",2,
                "needs", 450.99, "women", 25, 99));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Xbox One X 1TB žaidimų konsolė Black", 43,
                "entertainment-gaming", 420.99, "men", 14 , 33 ));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Xbox One X 1TB žaidimų konsolė Black",3,
                "entertainment-gaming", 420.99, "men", 14, 33));
        secondProductsBook.add(new SecProduct(book, "electronics", "Xbox One X 1TB žaidimų konsolė Black",7,
                "entertainment-gaming", 420.99, "men", 14, 33));

        secondProductsTV.add(new SecProduct(TV, "domestic", "KitchenAid 5KMT221EER skrudintuvas empire red",6,
                "kitchen", 45.99, "non", 18, 99));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "KitchenAid 5KMT221EER skrudintuvas empire red",3,
                "kitchen", 45.99, "non", 18, 99));
        secondProductsBook.add(new SecProduct(book, "domestic", "KitchenAid 5KMT221EER skrudintuvas empire red",5,
                "kitchen", 45.99, "non", 18, 99));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Sony HDRCX450B.CEN vaizdo kamera",13,
                "entertainment-filming", 250.99, "non", 14, 75));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Sony HDRCX450B.CEN vaizdo kamera",5,
                "entertainment-filming", 250.99, "non", 14, 75));
        secondProductsBook.add(new SecProduct(book, "electronics", "Sony HDRCX450B.CEN vaizdo kamera",2,
                "entertainment-filming", 250.99, "non", 14, 75));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Aurora AU3371 maisto produktų džiovyklė",4,
                "kitchen", 35.99, "non", 18, 99));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Aurora AU3371 maisto produktų džiovyklė",2,
                "kitchen", 35.99, "non", 18, 99));
        secondProductsBook.add(new SecProduct(book, "domestic", "Aurora AU3371 maisto produktų džiovyklė",2,
                "kitchen", 35.99, "non", 18, 99));

        secondProductsTV.add(new SecProduct(TV, "other", "DROBEC 16 Dema dviratis",14,
                "entertainment-sports", 278.99, "non", 14, 33));
        secondProductsFridge.add(new SecProduct(fridge, "other", "DROBEC 16 Dema dviratis",5,
                "entertainment-sports", 278.99, "non", 14, 33));
        secondProductsBook.add(new SecProduct(book, "other", "DROBEC 16 Dema dviratis",2,
                "entertainment-sports", 278.99, "non", 14, 33));

        secondProductsTV.add(new SecProduct(TV, "electronics", "MDRZX110APP.CE7 Sony ausinės",16,
                "entertainment-music", 120.99, "non", 14, 25));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "MDRZX110APP.CE7 Sony ausinės",3,
                "entertainment-music", 120.99, "non", 14, 25));
        secondProductsBook.add(new SecProduct(book, "electronics", "MDRZX110APP.CE7 Sony ausinės",7,
                "entertainment-music", 120.99, "non", 14, 25));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Setty 3D VR CASE virtualios realybės akiniai",18,
                "entertainment-gaming", 450.00, "men", 14, 33));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Setty 3D VR CASE virtualios realybės akiniai",3,
                "entertainment-gaming", 450.00, "men", 14, 33));
        secondProductsBook.add(new SecProduct(book, "electronics", "Setty 3D VR CASE virtualios realybės akiniai",2,
                "entertainment-gaming", 450.00, "men", 14, 33));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Tristar WF-2120 belgiškų vaflių keptuvė",10,
                "kitchen", 78.99, "non", 18, 99));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Tristar WF-2120 belgiškų vaflių keptuvė",6,
                "kitchen", 78.99, "non", 18, 99));
        secondProductsBook.add(new SecProduct(book, "domestic", "Tristar WF-2120 belgiškų vaflių keptuvė",6,
                "kitchen", 78.99, "non", 18, 99));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Delimano Stone Expert aukšta elektrinė keptuvė 24cm",2,
                "kitchen", 39.99, "women", 25, 99));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Delimano Stone Expert aukšta elektrinė keptuvė 24cm",5,
                "kitchen", 39.99, "women", 25, 99));
        secondProductsBook.add(new SecProduct(book, "domestic", "Delimano Stone Expert aukšta elektrinė keptuvė 24cm",0,
                "kitchen", 39.99, "women", 25, 99));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Nešiojama kolonėlė JBL XTREME Bluetooth 2x20 W atspari drėgmei juoda", 33,
                "entertainment-music", 39.99, "non", 14, 25));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Nešiojama kolonėlė JBL XTREME Bluetooth 2x20 W atspari drėgmei juoda", 4,
                "entertainment-music", 39.99, "non", 14, 25));
        secondProductsBook.add(new SecProduct(book, "electronics", "Nešiojama kolonėlė JBL XTREME Bluetooth 2x20 W atspari drėgmei juoda", 7,
                "entertainment-music", 39.99, "non", 14, 25));

        secondProductsTV.add(new SecProduct(TV, "other", "AGAW3921C N 39 Adonis akustinė gitara šviesus medis", 6,
                "entertainment-music", 240.00, "non", 14, 25));
        secondProductsFridge.add(new SecProduct(fridge, "other", "AGAW3921C N 39 Adonis akustinė gitara šviesus medis", 3,
                "entertainment-music", 240.00, "non", 14, 25));
        secondProductsBook.add(new SecProduct(book, "other", "AGAW3921C N 39 Adonis akustinė gitara šviesus medis", 7,
                "entertainment-music", 240.00, "non", 14, 25));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Logitech 920-002563 klaviatūros ir pelės komplektas MK120",5,
                "entertainment-work", 120.59, "men", 14, 75));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Logitech 920-002563 klaviatūros ir pelės komplektas MK120",5,
                "entertainment-work", 120.59, "men", 14, 75));
        secondProductsBook.add(new SecProduct(book, "electronics", "Logitech 920-002563 klaviatūros ir pelės komplektas MK120",3,
                "entertainment-work", 120.59, "men", 14, 75));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Olympus WS-853 diktofonas 8 GB Black",4,
                "entertainment-work", 45.99, "non", 25, 75));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Olympus WS-853 diktofonas 8 GB Black",3,
                "entertainment-work", 45.99, "non", 25, 75));
        secondProductsBook.add(new SecProduct(book, "electronics", "Olympus WS-853 diktofonas 8 GB Black",1,
                "entertainment-work", 45.99, "non", 25, 75));

        secondProductsTV.add(new SecProduct(TV, "domestic", "TWK7801 Bosch elektrinis virdulys",5,
                "kitchen", 19.99, "non", 18, 99));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "TWK7801 Bosch elektrinis virdulys",7,
                "kitchen", 19.99, "non", 18, 99));
        secondProductsBook.add(new SecProduct(book, "domestic", "TWK7801 Bosch elektrinis virdulys",1,
                "kitchen", 19.99, "non", 18, 99));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Philips S5420/06 barzdaskutė",3,
                "personal care", 45.99, "men", 18, 99));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Philips S5420/06 barzdaskutė",3,
                "personal care", 45.99, "men", 18, 99));
        secondProductsBook.add(new SecProduct(book, "electronics", "Philips S5420/06 barzdaskutė",0,
                "personal care", 45.99, "men", 18, 99));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Saeco SM5473/10 PicoBaristo V2 kavos aparatas",35,
                "kitchen", 105.00, "non", 14, 45));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Saeco SM5473/10 PicoBaristo V2 kavos aparatas",11,
                "kitchen", 105.00, "non", 14, 45));
        secondProductsBook.add(new SecProduct(book, "electronics", "Saeco SM5473/10 PicoBaristo V2 kavos aparatas",12,
                "kitchen", 105.00, "non", 14, 45));

        secondProductsTV.add(new SecProduct(TV, "other", "Andrius Tapinas Prezidentas",1,
                "entertainment-knowledge", 15.99, "non", 18, 75));
        secondProductsFridge.add(new SecProduct(fridge, "other", "Andrius Tapinas Prezidentas",3,
                "entertainment-knowledge", 15.99, "non", 18, 75));
        secondProductsBook.add(new SecProduct(book, "other", "Andrius Tapinas Prezidentas",9,
                "entertainment-knowledge", 15.99, "non", 18, 75));

        secondProductsTV.add(new SecProduct(TV, "other", "Viamare 190 Slat, PVC Inflatable Boat, 2 person(s)",4,
                "entertainment-active", 229.99, "non", 18, 45));
        secondProductsFridge.add(new SecProduct(fridge, "other", "Viamare 190 Slat, PVC Inflatable Boat, 2 person(s)",1,
                "entertainment-active", 229.99, "non", 18, 45));
        secondProductsBook.add(new SecProduct(book, "other", "Viamare 190 Slat, PVC Inflatable Boat, 2 person(s)",3,
                "entertainment-active", 229.99, "non", 18, 45));

        secondProductsTV.add(new SecProduct(TV, "other", "Sharp KC930EUW oro valytuvas-jonizatorius",5,
                "healthy-life", 45.99, "non", 25, 75));
        secondProductsFridge.add(new SecProduct(fridge, "other", "Sharp KC930EUW oro valytuvas-jonizatorius",6,
                "healthy-life", 45.99, "non", 25, 75));
        secondProductsBook.add(new SecProduct(book, "other", "Sharp KC930EUW oro valytuvas-jonizatorius",1,
                "healthy-life", 45.99, "non", 25, 75));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Huawei P20 Lite mobilus telefonas 64GB dual SIM Black",31,
                "communication-gaming-filming", 899.90, "non", 14, 45));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Huawei P20 Lite mobilus telefonas 64GB dual SIM Black",5,
                "communication-gaming-filming", 899.90, "non", 14, 45));
        secondProductsBook.add(new SecProduct(book, "electronics", "Huawei P20 Lite mobilus telefonas 64GB dual SIM Black",7,
                "communication-gaming-filming", 899.90, "non", 14, 45));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Remax RT-E500 Time Folding Portable Led Table-Clip Lamp",2,
                "needs", 45.99, "non", 14, 75));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Remax RT-E500 Time Folding Portable Led Table-Clip Lamp",6,
                "needs", 45.99, "non", 14, 75));
        secondProductsBook.add(new SecProduct(book, "electronics", "Remax RT-E500 Time Folding Portable Led Table-Clip Lamp",1,
                "needs", 45.99, "non", 14, 75));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Samsung MS23F301TAK mikrobangų krosnelė",6,
                "kitchen", 125.99, "non", 18, 99));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Samsung MS23F301TAK mikrobangų krosnelė",9,
                "kitchen", 125.99, "non", 18, 99));
        secondProductsBook.add(new SecProduct(book, "domestic", "Samsung MS23F301TAK mikrobangų krosnelė",6,
                "kitchen", 125.99, "non", 18, 99));

        System.out.println("Choose one item");
        System.out.println();
        System.out.println("1 - Televizorius PHILIPS 49PUS6412/12. 3840 x 2160 (4K UHD)");
        System.out.println("2 - Šaldytuvas SAMSUNG RB33J3205SA/EF");
        System.out.println("3 - Šerloko Holmso kolekciją");



        int choice = scan.nextInt();
        long start = System.nanoTime();
        switch (choice) {
            case 1:
                System.out.println("Recomendations:");
                for (SecProduct item : secondProductsTV
                ) {

                    double priceDif = abs(item.getFirstProduct().getPrice() - item.getPrice());
                    if ((priceDif <= 700) && (item.getPopularity() >= 10)
                    ) {
                        System.out.println(item.getCategory().toUpperCase() + " category " + item.getName());
                    }
                }
                secondProductsTV.clear();
                secondProductsFridge.clear();
                secondProductsBook.clear();
                break;
            case 2:
                System.out.println("Recomendations:");
                for (SecProduct item : secondProductsFridge
                ) {
                    double priceDif = abs(item.getFirstProduct().getPrice() - item.getPrice());
                    if ((priceDif <= 500) && (item.getPopularity() >= 10)
                    ){
                        System.out.println(item.getCategory().toUpperCase() + " category " + item.getName());
                    }
                }
                secondProductsTV.clear();
                secondProductsFridge.clear();
                secondProductsBook.clear();
                break;
            case 3:
                System.out.println("Recomendations:");
                for (SecProduct item : secondProductsBook
                ) {

                    double priceDif = abs(item.getFirstProduct().getPrice() - item.getPrice());
                    if ((priceDif <= 100) && (item.getPopularity() >= 10)
                    ){
                        System.out.println(item.getCategory().toUpperCase() + " category " + item.getName());
                    }
                }
                secondProductsTV.clear();
                secondProductsFridge.clear();
                secondProductsBook.clear();
                break;
            default:
                System.out.println("Please input 1,2 or 3");
                break;
        }





        long elapsedTime = System.nanoTime() - start;
        System.out.println();
        System.out.println("Counted per " + elapsedTime + " nanoseconds");
        System.out.println("Please wait for 3 seconds");
        Thread.sleep(3000);
        System.out.println();
        Main.menu();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class ProductHelper {
    public static List<Product> firstProducts = new ArrayList<>();
    public static List<SecProduct> secondProductsTV = new ArrayList<>();
    public static List<SecProduct> secondProductsFridge = new ArrayList<>();
    public static List<SecProduct> secondProductsBook = new ArrayList<>();

    public static void ProductHelper(int age, int gender) throws InterruptedException {

        Scanner scan = new Scanner(System.in);

        Product TV = new Product("electronics", "Televizorius PHILIPS 49PUS6412/12. 3840 x 2160 (4K UHD)", "entertainment-tv", 1499.99);
        Product fridge = new Product("domestic", "Šaldytuvas SAMSUNG RB33J3205SA/EF", "kitchen", 789.99);
        Product book = new Product("other", "Šerloko Holmso kolekciją", "entertainment-konwlegde", 15.99);

        firstProducts.add(TV);
        firstProducts.add(fridge);
        firstProducts.add(book);

        secondProductsTV.add(new SecProduct(TV, "electronics", "Lenovo Legion Y530-15ICH nešiojamas kompiuteris",
                "entertainment-gaming-work", 1999.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Lenovo Legion Y530-15ICH nešiojamas kompiuteris",
                "entertainment-gaming-work", 1999.9, "non"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Lenovo Legion Y530-15ICH nešiojamas kompiuteris",
                "entertainment-gaming-work", 1999.9, "non"));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Kavos virimo aparatas DELONGHI DOLCE GUSTO Colors EDG355.B",
                "kitchen", 799.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Kavos virimo aparatas DELONGHI DOLCE GUSTO Colors EDG355.B",
                "kitchen", 799.99, "non"));
        secondProductsBook.add(new SecProduct(book, "domestic", "Kavos virimo aparatas DELONGHI DOLCE GUSTO Colors EDG355.B",
                "kitchen", 799.9, "non"));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Skalbimo mašina SAMSUNG WW90M760NOA/LE QuickDrive",
                "needs", 450.99, "women"));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Skalbimo mašina SAMSUNG WW90M760NOA/LE QuickDrive",
                "needs", 450.99, "women"));
        secondProductsBook.add(new SecProduct(book, "domestic", "Skalbimo mašina SAMSUNG WW90M760NOA/LE QuickDrive",
                "needs", 450.99, "women"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Xbox One X 1TB žaidimų konsolė Black",
                "entertainment-gaming", 420.99, "men"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Xbox One X 1TB žaidimų konsolė Black",
                "entertainment-gaming", 420.99, "men"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Xbox One X 1TB žaidimų konsolė Black",
                "entertainment-gaming", 420.99, "men"));

        secondProductsTV.add(new SecProduct(TV, "domestic", "KitchenAid 5KMT221EER skrudintuvas empire red",
                "kitchen", 45.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "KitchenAid 5KMT221EER skrudintuvas empire red",
                "kitchen", 45.99, "non"));
        secondProductsBook.add(new SecProduct(book, "domestic", "KitchenAid 5KMT221EER skrudintuvas empire red",
                "kitchen", 45.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Sony HDRCX450B.CEN vaizdo kamera",
                "entertainment-filming", 250.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Sony HDRCX450B.CEN vaizdo kamera",
                "entertainment-filming", 250.99, "non"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Sony HDRCX450B.CEN vaizdo kamera",
                "entertainment-filming", 250.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Aurora AU3371 maisto produktų džiovyklė",
                "kitchen", 35.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Aurora AU3371 maisto produktų džiovyklė",
                "kitchen", 35.99, "non"));
        secondProductsBook.add(new SecProduct(book, "domestic", "Aurora AU3371 maisto produktų džiovyklė",
                "kitchen", 35.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "other", "DROBEC 16 Dema dviratis",
                "entertainment-sports", 278.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "other", "DROBEC 16 Dema dviratis",
                "entertainment-sports", 278.99, "non"));
        secondProductsBook.add(new SecProduct(book, "other", "DROBEC 16 Dema dviratis",
                "entertainment-sports", 278.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "MDRZX110APP.CE7 Sony ausinės",
                "entertainment-music", 120.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "MDRZX110APP.CE7 Sony ausinės",
                "entertainment-music", 120.99, "non"));
        secondProductsBook.add(new SecProduct(book, "electronics", "MDRZX110APP.CE7 Sony ausinės",
                "entertainment-music", 120.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Setty 3D VR CASE virtualios realybės akiniai",
                "entertainment-gaming", 450.00, "men"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Setty 3D VR CASE virtualios realybės akiniai",
                "entertainment-gaming", 450.00, "men"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Setty 3D VR CASE virtualios realybės akiniai",
                "entertainment-gaming", 450.00, "men"));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Tristar WF-2120 belgiškų vaflių keptuvė",
                "kitchen", 78.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Tristar WF-2120 belgiškų vaflių keptuvė",
                "kitchen", 78.99, "non"));
        secondProductsBook.add(new SecProduct(book, "domestic", "Tristar WF-2120 belgiškų vaflių keptuvė",
                "kitchen", 78.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Delimano Stone Expert aukšta elektrinė keptuvė 24cm",
                "kitchen", 39.99, "women"));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Delimano Stone Expert aukšta elektrinė keptuvė 24cm",
                "kitchen", 39.99, "women"));
        secondProductsBook.add(new SecProduct(book, "domestic", "Delimano Stone Expert aukšta elektrinė keptuvė 24cm",
                "kitchen", 39.99, "women"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Nešiojama kolonėlė JBL XTREME Bluetooth 2x20 W atspari drėgmei juoda",
                "entertainment-music", 39.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Nešiojama kolonėlė JBL XTREME Bluetooth 2x20 W atspari drėgmei juoda",
                "entertainment-music", 39.99, "non"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Nešiojama kolonėlė JBL XTREME Bluetooth 2x20 W atspari drėgmei juoda",
                "entertainment-music", 39.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "other", "AGAW3921C N 39 Adonis akustinė gitara šviesus medis",
                "entertainment-music", 240.00, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "other", "AGAW3921C N 39 Adonis akustinė gitara šviesus medis",
                "entertainment-music", 240.00, "non"));
        secondProductsBook.add(new SecProduct(book, "other", "AGAW3921C N 39 Adonis akustinė gitara šviesus medis",
                "entertainment-music", 240.00, "non"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Logitech 920-002563 klaviatūros ir pelės komplektas MK120",
                "entertainment-work", 120.59, "men"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Logitech 920-002563 klaviatūros ir pelės komplektas MK120",
                "entertainment-work", 120.59, "men"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Logitech 920-002563 klaviatūros ir pelės komplektas MK120",
                "entertainment-work", 120.59, "men"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Olympus WS-853 diktofonas 8 GB Black",
                "entertainment-work", 45.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Olympus WS-853 diktofonas 8 GB Black",
                "entertainment-work", 45.99, "non"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Olympus WS-853 diktofonas 8 GB Black",
                "entertainment-work", 45.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "domestic", "TWK7801 Bosch elektrinis virdulys",
                "kitchen", 19.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "TWK7801 Bosch elektrinis virdulys",
                "kitchen", 19.99, "non"));
        secondProductsBook.add(new SecProduct(book, "domestic", "TWK7801 Bosch elektrinis virdulys",
                "kitchen", 19.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Philips S5420/06 barzdaskutė",
                "personal care", 45.99, "men"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Philips S5420/06 barzdaskutė",
                "personal care", 45.99, "men"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Philips S5420/06 barzdaskutė",
                "personal care", 45.99, "men"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Saeco SM5473/10 PicoBaristo V2 kavos aparatas",
                "kitchen", 105.00, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Saeco SM5473/10 PicoBaristo V2 kavos aparatas",
                "kitchen", 105.00, "non"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Saeco SM5473/10 PicoBaristo V2 kavos aparatas",
                "kitchen", 105.00, "non"));

        secondProductsTV.add(new SecProduct(TV, "other", "Andrius Tapinas Prezidentas",
                "entertainment-knowledge", 15.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "other", "Andrius Tapinas Prezidentas",
                "entertainment-knowledge", 15.99, "non"));
        secondProductsBook.add(new SecProduct(book, "other", "Andrius Tapinas Prezidentas",
                "entertainment-knowledge", 15.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "other", "Viamare 190 Slat, PVC Inflatable Boat, 2 person(s)",
                "entertainment-active", 229.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "other", "Viamare 190 Slat, PVC Inflatable Boat, 2 person(s)",
                "entertainment-active", 229.99, "non"));
        secondProductsBook.add(new SecProduct(book, "other", "Viamare 190 Slat, PVC Inflatable Boat, 2 person(s)",
                "entertainment-active", 229.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "other", "Sharp KC930EUW oro valytuvas-jonizatorius",
                "healthy-life", 45.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "other", "Sharp KC930EUW oro valytuvas-jonizatorius",
                "healthy-life", 45.99, "non"));
        secondProductsBook.add(new SecProduct(book, "other", "Sharp KC930EUW oro valytuvas-jonizatorius",
                "healthy-life", 45.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Huawei P20 Lite mobilus telefonas 64GB dual SIM Black",
                "communication-gaming-filming", 899.90, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Huawei P20 Lite mobilus telefonas 64GB dual SIM Black",
                "communication-gaming-filming", 899.90, "non"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Huawei P20 Lite mobilus telefonas 64GB dual SIM Black",
                "communication-gaming-filming", 899.90, "non"));

        secondProductsTV.add(new SecProduct(TV, "electronics", "Remax RT-E500 Time Folding Portable Led Table-Clip Lamp",
                "needs", 45.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "electronics", "Remax RT-E500 Time Folding Portable Led Table-Clip Lamp",
                "needs", 45.99, "non"));
        secondProductsBook.add(new SecProduct(book, "electronics", "Remax RT-E500 Time Folding Portable Led Table-Clip Lamp",
                "needs", 45.99, "non"));

        secondProductsTV.add(new SecProduct(TV, "domestic", "Samsung MS23F301TAK mikrobangų krosnelė",
                "kitchen", 125.99, "non"));
        secondProductsFridge.add(new SecProduct(fridge, "domestic", "Samsung MS23F301TAK mikrobangų krosnelė",
                "kitchen", 125.99, "non"));
        secondProductsBook.add(new SecProduct(book, "domestic", "Samsung MS23F301TAK mikrobangų krosnelė",
                "kitchen", 125.99, "non"));

        System.out.println("Pasirinikite viena preke");
        System.out.println();
        System.out.println("1 - Televizorius PHILIPS 49PUS6412/12. 3840 x 2160 (4K UHD)");
        System.out.println("2 - Šaldytuvas SAMSUNG RB33J3205SA/EF");
        System.out.println("3 - Šerloko Holmso kolekciją");

        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                for (SecProduct item : secondProductsTV
                ) {
                    double priceDif = abs(item.getFirstProduct().getPrice() - item.getPrice());
                    if (item.getCategory() == "electronics" && item.getWhereUsed().contains("entertainment") && (priceDif <= 500)) {
                        System.out.println(item.getCategory().toUpperCase() + " kategorijos " + item.getName());
                    }
                }
                secondProductsTV.clear();
                secondProductsFridge.clear();
                secondProductsBook.clear();
                break;
            case 2:
                for (SecProduct item : secondProductsFridge
                ) {
                    double priceDif = abs(item.getFirstProduct().getPrice() - item.getPrice());
                    if (item.getCategory() == "domestic" && item.getWhereUsed().contains("kitchen") && (priceDif <= 150)) {
                        System.out.println(item.getCategory().toUpperCase() + " kategorijos " + item.getName());
                    }
                }
                secondProductsTV.clear();
                secondProductsFridge.clear();
                secondProductsBook.clear();
                break;
            case 3:
                for (SecProduct item : secondProductsBook
                ) {
                    double priceDif = abs(item.getFirstProduct().getPrice() - item.getPrice());
                    if (item.getCategory() == "other" && item.getWhereUsed().contains("entertainment") && (priceDif <= 150)) {
                        System.out.println(item.getCategory().toUpperCase() + " kategorijos " + item.getName());
                    }
                }
                secondProductsTV.clear();
                secondProductsFridge.clear();
                secondProductsBook.clear();
                break;
            default:
                System.out.println("Iveskite skaiciu 1,2 arba 3");
                break;
        }




        System.out.println("Rekomendacijos Jums:");


        double start = System.currentTimeMillis();


        double elapsedTime = System.currentTimeMillis() - start;
        System.out.println();
        System.out.println("Skaiciavimas padarytas per " + elapsedTime / 1000 + " sekundes");
        System.out.println("Palaukite 3 sekundes");
        Thread.sleep(3000);
        System.out.println();
        Main.menu();
    }
}

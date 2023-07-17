package shopiing_mall;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the product : ");
        System.out.println("------------------------");
        System.out.println("Press  1 for Fruits. ");
        System.out.println("Press  2 for Vegi. ");
        System.out.println("Press  3 for Drinks. ");
        System.out.println("Press  4 for Sprices. ");
        System.out.println("Press  5 for Oils. ");

        System.out.println("Please select an item form the above list : ");
        int item_code = sc.nextInt();
        wallet obj = new wallet();
        String item_name = obj.list(item_code);
        double price = obj.price(item_name);
        obj.bill(price);


    }
}

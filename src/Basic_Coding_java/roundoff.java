package Basic_Coding_java;

import java.util.Scanner;

public class roundoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        double store = sc.nextDouble();


        System.out.println(Math.round(store));
        System.out.println(Math.floor(store));
        System.out.println(Math.ceil(store));
    }
}

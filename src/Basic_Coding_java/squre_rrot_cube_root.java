package Basic_Coding_java;

import java.util.Scanner;

public class squre_rrot_cube_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for squre root : ");
        double store = sc.nextDouble();
        System.out.println("Enter the number for cube root : ");
        double store1= sc.nextDouble();


        System.out.println("The Squre root of " + store+ " is " + Math.sqrt(store));
        System.out.println("The Cube root of " + store1+ " is " +Math.cbrt(store1));

    }
}

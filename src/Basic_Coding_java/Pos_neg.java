package Basic_Coding_java;

import java.util.Scanner;

public class Pos_neg {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("number is negetive : ");
        } else if (num == 0) {
            System.out.println("ye zero hai bhai ");
        } else {
            System.out.println("number is positive");
        }

    }
}

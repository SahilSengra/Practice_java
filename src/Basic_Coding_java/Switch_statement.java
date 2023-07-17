package Basic_Coding_java;

import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter options : ");
        int opt = sc.nextInt();


        switch (opt) {
            case 1:
                System.out.println(" you choose option 1");
                break;

            case 2:
                System.out.println(" you choose option 2");
                break;

            case 3:
                System.out.println(" you choose option 3");
                break;

            case 4:
                System.out.println(" you choose option 4");
                break;

            default:
                System.out.println(" Galat option");
                break;

        }
    }
}

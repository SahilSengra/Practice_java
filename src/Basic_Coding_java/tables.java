package Basic_Coding_java;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print table : ");
        int value = sc.nextInt();

        for (int i=1; i<=10;i++){
            int multi= value*i;
            System.out.println(+value + " x " +i+ " = " +multi);
        }
    }
}

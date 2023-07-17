package Basic_Coding_java;

import java.util.Scanner;

public class greatest_of_two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number : ");
        double first = sc.nextDouble();
        System.out.println(" Enter Second number : ");
        double Second = sc.nextDouble();

        if (first < Second) {
            System.out.println(+Second + " is greater then " + first);
        } else if (first == Second) {
            System.out.println(" Both are equal ");
        }else
        {
            System.out.println(+first + " is greater then " + Second);
        }
    }
}

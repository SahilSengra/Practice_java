package Intermidiate_Coding_java;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any digit : ");
        int dig = sc.nextInt();
        int sum = 0;
        while (dig!=0)
        {
            sum+=dig%10;
            dig=dig/10;
        }
        System.out.println(" then sum of numner is "+sum);
    }
}

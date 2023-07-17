package Intermidiate_Coding_java;

import java.util.Scanner;

public class sum_of_given_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value : ");
        int fir = sc.nextInt();
        System.out.println("Enter Second Vlaue : ");
        int sec = sc.nextInt();
        int sum = 0;
        for ( int i = fir; i<=sec; i++){
             sum=sum+i;
        }
        System.out.println(" the total sum is  : "+sum);
    }
}

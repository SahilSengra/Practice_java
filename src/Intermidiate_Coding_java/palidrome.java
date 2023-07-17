package Intermidiate_Coding_java;

import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any number : ");
        int num = sc.nextInt();
        int cheak = num;

        int reverse =0;
        int remender;

        while (num!=0)
        {
            remender = num%10;
            reverse = reverse*10+remender;
            num= num/10;
        }
        System.out.println("the reverse of this number is " +reverse);
        if (reverse==cheak){
            System.out.println("the number is palidrome");
        }
        else {

            System.out.println("not palidrome");
        }
    }
}

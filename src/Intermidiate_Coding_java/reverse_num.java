package Intermidiate_Coding_java;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any number  : ");
        int num = sc.nextInt();


        int reverse=0;
        int remender;
        while (num!=0)
        {
            remender= num%10;
            reverse= reverse*10+remender;
            num = num/10;
        }
        System.out.println(" then sum of numner is "+reverse);
    }
}

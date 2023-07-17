package Intermidiate_Coding_java;

import java.util.Scanner;

public class Sum_of_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter Starting number : ");
        int num = sc.nextInt();
         int  sum=0;

         for( int i =1; i<=num;i++){
             sum=sum+i;

         }
        System.out.println(" the total sum is : "+sum);
    }
}

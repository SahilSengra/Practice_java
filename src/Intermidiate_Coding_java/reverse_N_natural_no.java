package Intermidiate_Coding_java;

import java.util.Scanner;

public class reverse_N_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter Starting number : ");
        int num = sc.nextInt();

        for(int i=num;i>=0;i--){
            System.out.println(+i+ "");
        }
    }

}
